<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="CommonHeader.jsp" %>

<html>
<body>

<form action="ProductController" method="post" style="border:1px solid #ccc">
  <div class="container">
    <h1>Add Products</h1>
    <p>Supplier use Only</p>
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
    <label for="pprice"><b>Price</b></label>
    <input type="text" placeholder="Enter Product Price" name="price" ID="pprice" required>
    
    <label for="cat"><b>Category</b></label>
    <select name="category" ID="cat">
    	<option value="Mobile">Mobile</option>
    	<option value="Laptop">Laptop</option>
    </select>
    
    <label for="manufacturer"><b>Manufacturer</b></label>
    <select name="manufacturer" ID="manufacturer">
    	<option value="XIOMI">XIOMI</option>
    	<option value="SAMSUNG">SAMSUNG</option>
    	<option value="DELL">DELL</option>
    </select>
        
    <div class="clearfix">
      <button type="reset" class="cancelbtn">Reset</button>
      <button type="submit" class="signupbtn">Submit</button>
    </div>
  </div>
</form>

</body>
</html>