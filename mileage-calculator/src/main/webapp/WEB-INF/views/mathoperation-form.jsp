<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Math Operations</title>
<link rel="stylesheet" href="/style.css" />
</head>
<body>
	<div>
		<form action="/mathoperation/result">
			<label for="num1">Number 1: </label> <input type="number" name="num1" />
			<select name="operation">
				<option value="add">+</option>
				<option value="sub">-</option>
				<option value="mul">*</option>
				<option value="div">/</option>
			</select> <label for="num2">Number 2: </label> <input type="number"
				name="num2" />
			<p align="center">
				<button class="button" type="submit">Calculate</button>
			</p>
		</form>

	</div>
</body>
</html>