<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Die Roll Form</title>
<link rel = "stylesheet" href = "/style.css" />
</head>
<body>
<form action="/dieroll-result">
 <p>
      <span class = "die">?</span>
      <span class = "die">?</span>
    </p>
    <p>
      <button class = "button" type = "submit">Roll</button>
     
      
    </p>
    <p>
      Number of sides: <input name= "sides" type = "number" min = "1"  max = "6"/>
      </p>
      </form>
</body>
</html>