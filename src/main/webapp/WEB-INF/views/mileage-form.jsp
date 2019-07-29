<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mileage Form</title>
<link rel = "stylesheet" href = "/style.css" />
</head>
<body>
<div>
<h1>Please enter Mileage and Gallons in tank</h1>
<form action = "/mileage-result">		
		<p>Mileage (MPG): <input type="number" step="0.01" min = "1" name="mpg" /> </p>
		<p>Gallons in tank: <input type="number" step="0.01" min = "1"name="gallons" /> </p>
		<p><button class = "button"  type="submit">Calculate</button></p>
	</form>
	</div>
</body>
</html>