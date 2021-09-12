
<form method="get" action="index.php">
<?php
$prod = $_REQUEST['pid'];
$sql = "select * from product where ID=?";

if( $stmt = $mysqli->prepare($sql) ) {
	$stmt->bind_param("i", $prod);
	$stmt->execute();
	$result = $stmt->get_result();
	while ($row = $result->fetch_assoc()) {
		print "<b>$row[Title] </b>";
		print "<p>$row[Description]  </p>";
}}

echo"<input type='number' value='1' name='qty'>";

echo"<input type='hidden' name='pid' value=".$prod .">";
echo"<input type='hidden' name='p' value='add_cart'>";

echo"<input type='submit' value='Prosthiki'>";


?>
</form>