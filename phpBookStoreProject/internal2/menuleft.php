<ul>
<?php
echo "<h1 style=text-align='left'>Product Menu </h1>";

$sql = 'select * from category order by Name';

if (! ($res = $mysqli->query($sql))) {
 echo "Table creation failed: (" . 
 			$mysqli->errno . ") " . $mysqli->error;
} else {
	while ($row = $res->fetch_assoc()) {
		print "<li><a href='index.php?p=catinfo&catid=$row[ID]'>".
				"$row[Name]</a></li>";
	}
}



?>


</ul>

