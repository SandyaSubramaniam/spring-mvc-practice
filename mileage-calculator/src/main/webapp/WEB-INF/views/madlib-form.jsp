<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Madlib Form</title>
<link rel = "stylesheet" href = "/style.css" />
</head>
<body>
<div>
<h1>Pick Words.</h1>
<form action = "/madlib-story">		
		<p>Noun: <input type="text" name="noun" /> </p>
		<p>Adjective: <input type="text" name="adjective" /> </p>
		<p><button class = "button" type="submit">Tell me a story</button></p>
	</form>
	</div>
</body>
</html>