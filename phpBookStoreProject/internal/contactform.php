<?php 
if (isset($_POST['submit']))
{
	$name = $_POST['name'];
	$mailFrom = $_POST['mail'];
	$subject = $_POST['subject'];
	$message = $_POST['message'];
	
	$mailTo = "it164664@teithe.gr";
	$headers = "From to".$mailFrom;
	$text = "Μόλις λάβατε ένα μέιλ από".$name.".\n\n".$message;
 ini_set("SMTP","localhost");
   	ini_set("smtp_port","25");
  	 ini_set("sendmail_from","$mailFrom");
 	  ini_set("sendmail_path", "C:\wamp\bin\sendmail.exe -t");
	//$text = "Μόλις λάβατε ένα μέιλ από:\r\nSMTP = mail.zend.com\r\nsmtp_port = 25\r\nsendmail_from = $emailFrom".$message;
	mail($mailTo,$subject,$text,$headers);

	}


?>