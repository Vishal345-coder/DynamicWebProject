<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="CommonHeader.jsp" %>

<html>
	<form action="LoginCheck" method="post" style="border:1px solid #ccc">
  	<div class="container">
    <h1>Sign In</h1>
    <p>Please fill the Credentials to Sign in your account.</p>
    <hr>

    <label for="uname"><b>User Name</b></label>
    <br>
    <input type="text" placeholder="Enter User Name" name="username" ID="uname" required>
    
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password1" ID="psw" required>
    
    <div class="clearfix">
      <button type="reset" class="cancelbtn">Reset</button>
      <button type="submit" class="signupbtn">Sign In</button>
    </div>
  </div>
</form>
</body>
</html>