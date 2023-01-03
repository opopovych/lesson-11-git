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
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
	integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/cabinet.css">
<body>
	<div class="wrapper">
		<!-- Sidebar  -->
		<nav id="sidebar">
			<div class="sidebar-header">
				<a href="${pageContext.request.contextPath}/cabinet.jsp" class="h3">I-SHOP</a>
			</div>

			<ul class="list-unstyled components">

				<li class="active"><a href="#homeSubmenu"
					data-toggle="collapse" aria-expanded="false"
					class="dropdown-toggle">Editor</a>
					<ul class="collapse list-unstyled" id="homeSubmenu">
						<li><a
							href="${pageContext.request.contextPath}/createProduct.jsp">Create
								product</a></li>
						<li><a
							href="${pageContext.request.contextPath}/allProducts.jsp">All
								products</a></li>

					</ul></li>


			</ul>


		</nav>

		<!-- Page Content  -->
		<div id="content">

			<nav class="navbar navbar-expand-lg navbar-light bg-light">
				<div class="container-fluid">

					<button type="button" id="sidebarCollapse" class="btn btn-dark">
						<i class="fas fa-align-left"></i>

					</button>
					<button class="btn btn-dark d-inline-block d-lg-none ml-auto"
						type="button" data-toggle="collapse"
						data-target="#navbarSupportedContent"
						aria-controls="navbarSupportedContent" aria-expanded="false"
						aria-label="Toggle navigation">
						<i class="fas fa-align-justify"></i>
					</button>

					<div class="collapse navbar-collapse" id="navbarSupportedContent">
						<ul class="nav navbar-nav ml-auto">
<li class="nav-item">
								<button class=" bucket">
									<a href="${pageContext.request.contextPath}/bucket.jsp">Bucket</a>
								</button>
							</li>
							<li class="nav-item">
								<button class=" product-logout">LOGOUT</button>
							</li>
						</ul>
					</div>
				</div>
			</nav>
			<form class="col-md-6 mx-auto" style="z-index: 998;">
				<div class="form-group">
					<label for="nameProduct">NAME</label> <input type="text"
						class="form-control nameProduct"
						placeholder="Enter name of product">
				</div>
				<div class="form-group">
					<label for="descriptionPdoruct">DESCRIPTION</label> <input
						type="text" class="form-control descriptionProduct"
						placeholder="Enter descriotion of product">
				</div>
				<div class="form-group">
					<label for="priceProduct">PRICE</label> <input type="text"
						class="form-control priceProduct"
						placeholder="Enter price of product">
				</div>
				<button class="btn btn-primary mb-2 createProduct">Create</button>

			</form>
		</div>
	</div>
	<script
		src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

	<script src="js/cabinet.js"></script>
	<script defer
		src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js"
		integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ"
		crossorigin="anonymous"></script>
	<script defer
		src="https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js"
		integrity="sha384-6OIrr52G08NpOFSZdxxz1xdNSndlD4vdcf/q2myIUVO0VsqaGHJsB0RaBE01VTOY"
		crossorigin="anonymous"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script
		src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
	<script src="js/createProduct.js"></script>
		<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"
		integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ"
		crossorigin="anonymous"></script>
	<!-- Bootstrap JS -->
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"
		integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm"
		crossorigin="anonymous"></script>
</body>
</html>