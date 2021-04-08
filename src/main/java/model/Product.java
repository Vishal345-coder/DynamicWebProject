package model;

public class Product 
{
	String productName;
	String price;
	String category;
	String manufacturer;
	
	public Product() {}
	
	public Product(String productName, String price, String category, String manufacturer)
	{
		this.productName=productName;
		this.price=price;
		this.category=category;
		this.manufacturer=manufacturer;
	}
	
	public String getProductName() 
	{
		return productName;
	}
	public void setProductName(String productName) 
	{
		this.productName = productName;
	}
	public String getPrice() 
	{
		return price;
	}
	public void setPrice(String price) 
	{
		this.price = price;
	}
	public String getCategory() 
	{
		return category;
	}
	public void setCategory(String category) 
	{
		this.category = category;
	}
	public String getManufacturer() 
	{
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) 
	{
		this.manufacturer = manufacturer;
	}
}
