<?php
if($_SESSION['username']=='?')
{
	echo "den exete kanei login";
	
}

else{


	echo "<form  method='get' action='index.php'>" ;
	
	
	
	
	echo"<h1> KALATHI AGORWN </h1>";
	
	echo"<table>";
	
	 
	
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
	 
	 echo "<input name='p' value='empty_cart' type='hidden'/><br>";
	 echo"<input type='submit' value='Empty'>";
	 echo "</form>";
}
 ?>
  
 
 
 
 <form  method="get" action="index.php">
 
 <input name="p" value="buy_cart" type="hidden">
 <input type="submit" value="AGORA">
 </form>