<?php 


$name = $_SESSION['username']; 
$id=0;

$sql2 ="select ID from customer where uname='$name'";
$result = $mysqli->query($sql2);
    

if ($result->num_rows > 0) {
    // output data of each row
   while($row = $result->fetch_assoc()) {
        $id= $row["ID"];
            }
} 
else {
    echo "0 results";
}


$sql = "INSERT INTO `orders`( `Customer`, `oDate`) VALUES ($id,now())";

$order_id = $mysqli->insert_id;
 
 
    
if (mysqli_query($mysqli, $sql)) {
    echo "New order created successfully <br>";
}

 else {
    echo "Error: " . $sql . "<br>" . mysqli_error($conn);
}


$sql5="SELECT MAX(ID) AS DOKIMI FROM `orders`";
$result2 = $mysqli->query($sql5);


 while($row2 = $result2->fetch_assoc()) {
        echo $row2["DOKIMI"];  
       $ordersid = $row2["DOKIMI"];
            }
 



foreach($_SESSION['cart'] as $p => $q) {   //$p einai stin ousia to $pid kai to $q einai to $_REQUEST['qty']dld i posotita
		
		$sql3 =	"INSERT INTO `orderdetails`( `Orders`, `Quantity`,`Product`) VALUES ($ordersid,$q,$p)";	

		$orderdetails_id = $mysqli -> insert_id;	
		
		if (mysqli_query($mysqli, $sql3)) {
   			 echo "New orderList created successfully <br>";
		}

 		else {
   			 echo "Error: " . $sql3 . "<br>" . mysqli_error($mysqli);
		}
	 	
}
 


unset($_SESSION['cart']);

?>