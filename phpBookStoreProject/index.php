<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<?php
session_start();
if( ! isset($_SESSION['username'])) {
	$_SESSION['username']='?';
}

if( ! isset($_SESSION['language']))
{
	$_SESSION['language']='en';
}
require_once "internal2/dbconnect.php";

?>
<head>
	<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
	<title>Untitled 1</title>
	<link href="layout.css" rel="stylesheet" type="text/css" />
	
	
</head>

<body >
	<div id="top">
	
		<a id="top1" href="index.php?p=start">Αρχική</a>
		<a id="top2" href="?p=shopinfo">Κατάστημα</a>
		<a id="top3" href="?p=products">Προιόντα</a>
		<a id="top4" href="?p=kalathi">Καλάθι</a>
		<a id="top5" href="?p=login">Σύνδεση</a>
		<a id="top6" href="?p=communication">Επικοινωνία</a>
	    <input style="float:right" id="top7" type="button" value="αλλαγή γλώσσας" onclick="myFunction()"> </input>
		</div>
	<div id="left">
		<?php
		require "internal2/menuleft.php";
		
		
			print "<p>This is user: $_SESSION[username]</p>";
			if($_SESSION['username']=='admin') {
				print "<h1>Admin MENU</h1>";
				echo "<a  href='index.php?p=lista_Pelatwn'>Λίστα Πελατών</a><br/>";
				echo "<a  href='index.php?p=lista_Paraggeleiwn'>Λίστα Παραγγελιών</a><br/><br/>";
				
				echo "<h1>User MENU</h1>";
				echo "<a  href='index.php?p=emfanisi_Paraggeliwn'>Εμφάνιση Παραγγελιών</a><br/>";
				echo "<a  href='index.php?p=stoixeia_Pelati'>Στοιχεία Πελάτη</a><br/><br/>";
				echo "<a  href='index.php?p=Logout'>Logout</a><br/><br/>";
		
		
		
			}
			else if($_SESSION['username']=='?'){
				echo "Noone has connected";
			}
			else{
				echo "<h1>User MENU</h1>";
				echo "<a  href='index.php?p=emfanisi_Paraggeliwn'>Εμφάνιση Παραγγελιών</a><br/>";
				echo "<a  href='index.php?p=stoixeia_Pelati'>Στοιχεία Πελάτη</a><br/><br/>";
				echo "<a  href='index.php?p=Logout'>Logout</a><br/><br/>";
	}
				
				
				
		?>
	</div>
	<div id="content">
	
		<?php
		if( ! isset($_REQUEST['p'])) {
			$_REQUEST['p']='start';
		}
		$p = $_REQUEST['p'];
		
		switch ($p){
		case "start" :		require "internal/start.php";
							break;
		case "products":    require "internal/products.php";
							break;
		case "shopinfo": 	require "internal/shopinfo.php";
							break;
		case "kalathi": 	require "internal/kalathi.php";
							break;
		
		case "login" :		require "internal/login.php";
							break;
		case 'do_login':	require "internal/do_login.php";
							break;
		case 'communication':	require "internal/communication.php";
							break;
		case 'after_login':	require "internal/after.php";
							break;
		case 'Logout':	require "internal2/Logout.php";
							break;
		case 'emfanisi_Paraggeliwn':	require "internal2/emfanisi_Paraggeliwn.php";
							break;
		case 'stoixeia_Pelati':	require "internal2/stoixeia_Pelati.php";
							break;
		case 'lista_Pelatwn':	require "internal2/lista_Pelatwn.php";
							break;
		case 'lista_Paraggeleiwn':	require "internal2/lista_Paraggeleiwn.php";
							break;
		case 'catinfo':	require "internal2/catinfo.php";
				break;
		
		case 'productinfo':	require "internal2/productinfo.php";
				break;
		
		case 'add_cart':	require "internal2/add_cart.php";
				break;
		case 'empty_cart':	require "internal2/empty_cart.php";
				break;
		case 'buy_cart':	require "internal2/buy_cart.php";
				break;

		
		
		
		
		
		
		default: 
			print "Η σελίδα δεν υπάρχει";
		}
		?>
	</div>
	<div id="footer"></div>
</body>
</html>
