<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<title>Untitled 4</title>
</head>

<body>
<h1 >
Στοιχεία Πελάτη
</h1>

<?php
$pageWasRefreshed = isset($_SERVER['HTTP_CACHE_CONTROL']) && $_SERVER['HTTP_CACHE_CONTROL'] === 'max-age=0';

if(!$pageWasRefreshed ) {	
	if(isset($_REQUEST['action_save']))
	{
		echo "egine i apothikeusi stis: " . date("h:i:sa"). ". Hmerominia: " . date("Y/m/d") ;
		$Fname = $_REQUEST['Fname'];
		$Lname = $_REQUEST['Lname'];
		$Address = $_REQUEST['Address'];
		$Phone = $_REQUEST['Phone'];
		$id = $_REQUEST['ID'];
		
		$stmt = $mysqli->prepare("update customer set Fname=?, Lname=?, Address=?, Phone=? where ID=?");
		$stmt->bind_param("sssss", $Fname, $Lname, $Address,$Phone,$id);
		
		
	
		$stmt->execute();
		
	}
}	
	echo "<form method='get'>";
	
	$name = $_SESSION['username']; 
	$sql ="select * from customer where uname='$name'";
	
	$result = $mysqli->query($sql);
	    
	
	if ($result->num_rows > 0) {
	    // output data of each row
	   while($row = $result->fetch_assoc()) {
	  		echo "Onoma: <input type='text' name='Fname' value=".$row['Fname']."> <br>";     
			echo "Epitheto: <input type='text' name='Lname' value=".$row['Lname']."> <br>";   
			echo "Dieuthinsi: <input type='text' name='Address' value=".$row['Address']."> <br>";   
			echo "Tilefono: <input type='text' name='Phone' value=".$row['Phone']."> <br>";  
			$ID= $row["ID"];
	           }
	} 
	else {
	    echo "0 results";
	}
	
	echo "<input type='hidden' name='ID' value='$ID'>";	
	echo "<input type='submit' class='tn btn-primary' value='ΑΠΟΘΗΚΕΥΣΗ' name='action_save'>"; 	
	echo "<input type='hidden' name='p' value='stoixeia_Pelati'>";
	echo "</form>";	
		
		/*$name = $_SESSION['username']; 
	$sql ="select * from customer where uname=?";
	    
	
	if( $stmt = $mysqli->prepare($sql) ) {
		$stmt->bind_param("i", $name);
		$stmt->execute();
		$result = $stmt->get_result();
	*/
		?>
	
	


</body>

</html>
