<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit sucess</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

</head>
<body>
<nav class="navbar navbar-expand-sm navbar-primary bg-light">
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="signin.jsp"></a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#"></a>
    </li>
  </ul>
        
</nav>
<nav class="navbar navbar-expand-lg navbar-primary bg-light">
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarTogglerDemo01"
		aria-controls="navbarTogglerDemo01" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarTogglerDemo01">
		<a class="navbar-brand" href="Signup.jsp"></a>
		<ul class="navbar-nav mr-auto mt-2 mt-lg-0 ">
		</ul>
	<form class="form-inline my-2 my-lg-0">
	<a class="nav-link" href="Signin.jsp">Sign In</a>
	</form>
	</div>
	</nav>
	<form action="Submit.do" method="post">
	<div class="container w-50%">
	<div class="card-body" align="front">
	<h2 class="card-title" font="bold">
	<b>Registration form</b>
	</h2>
	<div class="form-group">
	  <div class="form-group col-md-6">
	  <label for="username"></label> <input name="Username" type="text"
	  class="form-control" placeholder="Username"
		id="username">
	</div>

	<div class="form-group">
		<div class="form-group col-md-6">
		<label for="email"></label> <input name="Email" type="text"
		class="form-control" placeholder="Email"
		id="email">
	</div>

	<div class="form-group">
		<div class="form-group col-md-6">
		<label for="mobile"></label> <input name="Mobile" type="text"
		class="form-control"placeholder="Mobile"
		id="mobile">
	</div>
	
	<div class="form-group">
		<div class="form-group col-md-6">
		<label for="password"></label> <input name="Password" type="password"
		class="form-control"placeholder="Password"
		id="password">
	</div>
	
	<div class="form-group">
		<div class="form-group col-md-6">
		<label for="confirmpassword"></label> <input name="Confirmpassword" type="password"
		class="form-control"placeholder="Confirmpassword"
		id="confirmpassword">
	</div>
	
	
	
		<button type="submit" class="btn btn-success">Submit The form</button>
	</div>
	
	<div class="text-center" align="center">
	<span style="color: green; font-family: cursive;">${successMessage}</span>
	<span style="color: red; font-family: cursive;">${failureMessage}</span>
	</div>
	
</form>
	
</body>
</html>