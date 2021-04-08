package model;

public class Customer 
{
	String username;
	String customerName;
	String gender;
	String mobNo;
	String emailId;
	String customerAddr;
	String password1;
	String rpassword1;
	
	public Customer() {}
	
	public Customer(String username, String customerName, String gender, String mobNo, String emailId, String customerAddr, String password1, String rpassword1)
	{
		this.username=username;
		this.customerName=customerName;
		this.gender=gender;
		this.mobNo=mobNo;
		this.emailId=emailId;
		this.customerAddr=customerAddr;
		this.password1=password1;
		this.rpassword1=rpassword1;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getCustomerAddr() {
		return customerAddr;
	}
	public void setCustomerAddr(String customerAddr) {
		this.customerAddr = customerAddr;
	}
	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	public String getRpassword1() {
		return rpassword1;
	}
	public void setRpassword1(String rpassword1) {
		this.rpassword1 = rpassword1;
	}
}
