<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="CommonHeader.jsp" %>

<html>
<body>

<form action="OrderCheck" method="post" style="border:1px solid #ccc">
  <div class="container">
    <h1>Order Products</h1>
    <p>All your Favourite is here.......</p>
    <hr>

    <label for="pname"><b>Product Name   :</b></label>
    <input list="plist" name="productName" ID="pname" required>
    	<datalist ID="plist" >
    		<option value="Redmi Note 10 Pro Max">
    		<option value="Redmi Note 10">
    		<option value="Redmi Note 10 Pro">Redmi Note 10 Pro</option>
    		<option value="Xiaomi Mi 10i">
    		<option value="Redmi 9 Power">
    		<option value="Xiaomi Mi 10T Pro 5G">
    		<option value="Xiaomi Redmi 9 Prime">
    		<option value="Samsung Galaxy A52">
    		<option value="Samsung Galaxy A72">
    		<option value="Samsung Galaxy A32 4G">
    		<option value="Samsung Galaxy F62">
    		<option value="Samsung Galaxy M12">
    		<option value="Samsung Galaxy M02">
    		<option value="New Inspiron 15 5509">
    		<option value="New Inspiron 14 5402">
    		<option value="New Inspiron 15 5509">
    		<option value="Dell XPS 13 9310">
    		<option value="Dell G5 15 SE 5505">
    		
    	</datalist>
    	<br><br>
    	<label for="uname"><b>Your Name</b></label>
   		<input type="text" placeholder="Enter Your Name" name="name" ID="uname" required>
   		
   		<label for="mno"><b>Contact Details</b></label>
    <input type="text" placeholder="Enter Mobile Number" name="mNo" ID="mno" required>
    
    <label for="del"><b>Payment</b></label>
    <input type="radio" value="C" name="payment" ID="del" required>Cash On Delivery
     <input type="radio" value="O" name="payment" ID="del" required>Debit/Credit Card
     <br><br>
    	<label for="caddr"><b>Address</b></label>
    <br><br>
    <textarea placeholder="Enter Address" name="customerAddr" cols="30" rows="5" ID="caddr" required></textarea>

        
    <div class="clearfix">
      <button type="reset" class="cancelbtn">Reset</button>
      <button type="submit" class="signupbtn">Order</button>
    </div>
  </div>
</form>

</body>
</html>