<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit The form</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-primary bg-light">
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarTogglerDemo01"
		aria-controls="navbarTogglerDemo01" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarTogglerDemo01">
		<a class="navbar-brand" href="Signup.jsp">SignUp</a>
		<ul class="navbar-nav mr-auto mt-2 mt-lg-0 ">
		</ul>
	<form class="form-inline my-2 my-lg-0">
	<!-- - --<a class="nav-link" href="Forgot.jsp">forgotPassword?</a>-->
	</form>
	</div>
	</nav>
	<form action="login.do" method="post">
    
    <div class="col-sm-6">
    <div class="form-group">
    <label for="forsite">Email</label>
    <input type="email" class="form-control" name="email" placeholder="enter the EmailId">
    </div>
    </div>
    
    <div class="col-sm-6">
    <div class="form-group">
    <label for="forsite">Password</label>
    <input type="password" class="form-control" name="password" placeholder="Enter the Passsword">
    </div>
    </div>
     <button type="submit" value="login">login</button>
         </form> 
         <div align="center">
<div>
<a href="Forgot.jsp">forgot your password</a>

</div>
<span style="color:red">${failureMessage}</span>

</div>

	
</body>
</html>