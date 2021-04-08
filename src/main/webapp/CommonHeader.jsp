<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="SignUp.css" type="text/css"/>
<style>
body 
{
	background-color: #00ffff;
}
ul 
{
	list-style-type: none;
  	margin: 0;
  	padding: 0;
  	overflow: hidden;
  	background-color: #333;
}
li 
{  
	float: left;
  	border-right:1px solid #bbb;
}
li:last-child 
{
	border-right: none;
}
li a 
{
	display: block;
  	color: white;
  	text-align: center;
  	padding: 14px 16px;
  	text-decoration: none;
}
li a:hover:not(.active) 
{
 	background-color: #111;
}
.active 
{
	background-color: #4CAF50;
}
</style>
</head>

<body>
<ul>
	<li><a class="active" href="Content.html">Home</a></li>
  	<li><a href="LogIn.jsp">Sign In</a></li>
  	<li><a href="Register.jsp">Sign Up</a></li>
   	<li><a href="Product.jsp">Product</a></li>
   	<li><a href="Order.jsp">Order</a></li>
  	<li style="float:right"><a href="ContactUs.html">Contact Us</a></li>
</ul>
</body>
</html>