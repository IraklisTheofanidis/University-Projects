<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<title>Untitled 1</title>
<link href="layout.css" rel="stylesheet" type="text/css" />

</head>

<body>
Proccessing login.....

<?php

		
	$u = $_REQUEST['username'];
	$p = $_REQUEST['pass'];
	$a=0;
	$b=0;
	
	if($u == 'admin' && $p=='123') {
		print "Welcome admin";
		$_SESSION['username'] = 'admin';
		echo("<meta http-equiv='refresh' content='1'>");
		$b=1;
			}

	
	$sql = "select * from customer where uname=? AND passwd=?";
	if( $stmt = $mysqli->prepare($sql) ) {
		$stmt->bind_param("ii",$u,$p);
		$stmt->execute();
		$result = $stmt->get_result();
		while ($row = $result->fetch_assoc()) {	
				
		if($row["uname"]==$u && $row["passwd"]==$p)
		{
			$a=1;
			print $row['uname'];   //san boolean to xrisimopoiw gia na dw an iparxei stin vasi kapoios xristis me to username pou plikrologithike
		}
	
		}
	
	}
				
		if($a==1)  //user apo tin vasi
		{
			
			$_SESSION['username']=$u;
			print "Welcome " . $_SESSION['username'];
			echo("<meta http-equiv='refresh' content='1'>");

		}	
			
			
	 elseif($a==0 && $b==0) {
		print "Unknown user";
		$_SESSION['username'] = '?';
		echo("<meta http-equiv='refresh' content='1'>");

	}


?>

</body>

</html>


