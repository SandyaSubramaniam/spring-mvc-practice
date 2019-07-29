<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Repeat Message</title>
<link rel = "stylesheet" href = "/style.css" />
</head>
<body>
<div>
<form action="/repeatmessage-result">
		<p>What is your message?: <input type="text" name="msg" /> </p>
		<p>How many times do you want to repeat this message?: <input type="number" min = "1" name="repeat" /> </p>
		<p><button class = "button"  type="submit">Repeat!</button></p>
	</form>
</div>
</body>
</html>