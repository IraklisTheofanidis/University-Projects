<table>
<tr><th>Name</th>
<th>Desc</th>

</tr>
<?php

$cat = $_REQUEST['catid'];
$sql = "select * from product where Category=?";
if( $stmt = $mysqli->prepare($sql) ) {
	$stmt->bind_param("i", $cat);
	$stmt->execute();
	$result = $stmt->get_result();
	while ($row = $result->fetch_assoc()) {
		print "<tr><td><a href='index.php?p=productinfo&pid=$row[ID]'>$row[Title]</a></td>".
			"<td>$row[Price].'β‚¬'</td></tr>";
	}

}
?>

</table>

