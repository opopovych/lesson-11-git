<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>${warning}</h3>
<form action = "ServletRegister" method = "post">
<label for="firstName"> First Name: </label>
<input name = "firstName">
<br>
<label for = "lastName">Last Name: </label>
<input name = "lastName">
<br>
<label for = "email">Email: </label>
<input name = "email">

<br>
<label for = "password">Password: </label>
<input type = "password" name = "password">
<br>
<input type = "submit" value = "submit">
</form>


</body>
</html>