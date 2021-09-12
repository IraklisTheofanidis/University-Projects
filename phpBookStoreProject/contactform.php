<?php 

if (isset($_POST['submit']))
{
	$name = $_POST['name'];
	$mailFrom = $_POST['mail'];
	$subject = $_POST['subject'];
	$message = $_POST['message'];
	
	$mailTo = "ira_theofanidis@hotmail.com";
	$headers = "From to".$mailFrom;
	$text = "Μόλις λάβατε ένα μέιλ από".$name.".\n\n".$message;	
	/*ini_set("SMTP", "localhost");
	ini_set("smtp_port", "25");
	ini_set("sendmail_from", "iraklistheofanidis@gmail.com");	
	*/
	if(mail($mailTo, $subject, $text, $headers))
    	echo $name.$mailFrom.$subject.$message."Email sent";
	else
    	echo "Email sending failed";
	//mail($mailTo,$subject,$text,$headers);
	//header("Location: index.php");
}
?>