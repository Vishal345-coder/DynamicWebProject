<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="CommonHeader.jsp" %>

<html>
<body>

<form action="Register" method="post" style="border:1px solid #ccc">
  <div class="container">
    <h1>Sign Up</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

    <label for="uname"><b>User Name</b></label>
    <input type="text" placeholder="Enter User Name" name="username" ID="uname" required>
    
    <label for="cname"><b>Customer Name</b></label>
    <input type="text" placeholder="Enter Customer Name" name="customerName" ID="cname" required>
    
    <label for="gen"><b>Gender     :</b></label>
    <input type="radio" value="M" name="gender" ID="gen" required>Male
     <input type="radio" value="F" name="gender" ID="gen" required>Female
    <br><br>
    <label for="mno"><b>Mobile Number</b></label>
    <input type="text" placeholder="Enter Mobile Number" name="mobNo" ID="mno" required>
    
    <label for="email"><b>Email ID</b></label>
    <input type="text" placeholder="Enter Email ID" name="emailId" ID="email" required>
    
    <label for="caddr"><b>Customer Address</b></label>
    <br><br>
    <textarea placeholder="Enter Customer Address" name="customerAddr" cols="30" rows="5" ID="caddr" required></textarea>
    <br><br>
    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password1" ID="psw" required>

    <label for="psw-repeat"><b>Repeat Password</b></label>
    <input type="password" placeholder="Repeat Password" name="rpassword1" ID="psw-repeat" required>
    
    <div class="clearfix">
      <button type="reset" class="cancelbtn">Reset</button>
      <button type="submit" class="signupbtn">Sign Up</button>
    </div>
  </div>
</form>

</body>
</html>