<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>i-store</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/login.css">

</head>
<body>
	<!--  <form action = "login" method = "post">
<br>
<label for = "login">Login: </label>
<input name = "login">
<br>
<label for = "password">Password: </label>
<input type = "password" name = "password">
<br>
<input type = "submit" value = "submit">
</form> -->
	<div class="login-page">
		<div class="form">
			<form class="register-form">
				<input type="text" class="firstName" placeholder="first name" /> <input
					type="text" class="lastName" placeholder="last name" /> <input
					type="text" class="email" placeholder="email" /> <input
					type="password" class="password" placeholder="password" />

				<button class="register">create</button>
				<p class="message">
					Already registered? <a href="#">Sign In</a>
				</p>
			</form>
			
			
			<form class="login-form">
				<input type="text" class="email" placeholder="email" />
				 <input type="password" class="password" placeholder="password" />
				<button class = "login">login</button>
				<p class="message">
					Not registered? <a href="#">Create an account</a>
				</p>
			</form>
		</div>
		<div class="alert alert-success alert-dismissible fade show" role="alert">
			<b>Success</b>You are registered
			<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
		</div>
	</div>


	<script
		src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
	<script src="js/login.js"></script>
</body>
</html>