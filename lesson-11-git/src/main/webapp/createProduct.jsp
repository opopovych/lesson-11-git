<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Creating product</title>
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<body>
<form>
  <div class="form-group">
    <label for="nameProduct">NAME</label>
    <input type="text" class="form-control nameProduct" placeholder="Enter name of product">
  </div>
  <div class="form-group">
    <label for="descriptionPdoruct" >DESCRIPTION</label>
    <input type="text" class="form-control descriptionProduct" placeholder="Enter descriotion of product">
  </div>
   <div class="form-group">
    <label for="priceProduct">PRICE</label>
    <input type="text" class="form-control priceProduct"  placeholder="Enter price of product">
  </div>
    <button  class="btn btn-primary mb-2 createProduct">Create</button>
    
</form>
	<script
		src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script src="js/createProduct.js"></script>
</body>
</html>