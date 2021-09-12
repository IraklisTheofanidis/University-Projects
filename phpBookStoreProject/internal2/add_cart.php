

<?php


	echo "<form  method='get' action='index.php'>" ;
	
	$pageWasRefreshed = isset($_SERVER['HTTP_CACHE_CONTROL']) && $_SERVER['HTTP_CACHE_CONTROL'] === 'max-age=0';
	
	if($pageWasRefreshed ) {
	
		echo"<h1> KALATHI AGORWN </h1>";
		
		echo"<table>";
		
		$pid = $_REQUEST['pid']; 
	
	if(! isset($_SESSION['cart']) || !is_array($_SESSION['cart'])) {
		 $_SESSION['cart']=array();
	}
	
	$sum=0;
	 $sql = "select * from product where ID=?";
	$stmt = $mysqli->prepare($sql);
	foreach($_SESSION['cart'] as $p => $q) {   //$p einai stin ousia to $pid kai to $q einai to $_REQUEST['qty']dld i posotita
	 	$stmt->bind_param("i", $p);
		 $stmt->execute();
		 $result = $stmt->get_result();
		 $row = $result->fetch_assoc();
		 $a=($q * $row['Price']);
	
	 	// echo "$p  $row[Title] $q...<br/>" . ($q * $row['Price']);
	 	echo "<tr><td> $row[Title] </td>";
	 	echo "<td>$q * $row[Price] =</td>";
	 	echo"<td>$a </td>";
		echo"</tr>";
	 	  	   $sum = $sum+$a;
	 }
	 echo "</table>";
	 echo "<br/> Sinoliko poso= ". $sum;
	 
	 echo "<input name='p' value='empty_cart' type='hidden'/>";
	 echo"<input type='submit' value='Empty'>";
	
	

	}
	
	else{
	
	
	
	
	
	echo"<h1> KALATHI AGORWN </h1>";
		
		echo"<table>";
		
		if(! isset($_SESSION['cart']) || !is_array($_SESSION['cart'])) {
		 $_SESSION['cart']=array();
		}
		
		

		$pid = $_REQUEST['pid'];
		$qty = $_REQUEST['qty']; 
		
				if(! isset($_SESSION['cart'][$pid]))
				{
					$_SESSION['cart'][$pid]=0;
				}
			
				$_SESSION['cart'][$pid] += $qty; 
		
		
		$sum=0;
		 $sql = "select * from product where ID=?";
		$stmt = $mysqli->prepare($sql);
		foreach($_SESSION['cart'] as $p => $q) {   //$p einai stin ousia to $pid kai to $q einai to $_REQUEST['qty']dld i posotita
		 	$stmt->bind_param("i", $p);
			 $stmt->execute();
			 $result = $stmt->get_result();
			 $row = $result->fetch_assoc();
			 $a=($q * $row['Price']);
		
		 	// echo "$p  $row[Title] $q...<br/>" . ($q * $row['Price']);
		 	echo "<tr><td> $row[Title] </td>";
		 	echo "<td>$q * $row[Price] =</td>";
		 	echo"<td>$a </td>";
			echo"</tr>";
		 	  	   $sum = $sum+$a;
		 }
		 echo "</table>";
		 echo "<br/> Sinoliko poso= ". $sum;
		 
		 echo "<input name='p' value='empty_cart' type='hidden'/>";
		 echo"<input type='submit' value='Empty'>";
	}
	
	echo "</form>";

 ?>
 

 
<form  method="get" action="index.php">
 
 <input name="p" value="buy_cart" type="hidden">
 <input type="submit" value="AGORA">
 </form> 