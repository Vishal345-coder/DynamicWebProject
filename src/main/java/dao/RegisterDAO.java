package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Customer;
import utility.DBConn;

public class RegisterDAO 
{
	Connection conn;
	
	public RegisterDAO() throws Exception
	{
		conn=DBConn.getMySQLConnection();
	}
	
	public boolean registerCustomer(Customer customer) throws SQLException
	{
		PreparedStatement psmt = conn.prepareStatement("insert into customer values(?,?,?,?,?,?,?,?)");
		
		psmt.setString(1, customer.getUsername());
		psmt.setString(2, customer.getCustomerName());
		psmt.setString(3, customer.getGender());
		psmt.setString(4, customer.getMobNo());
		psmt.setString(5, customer.getEmailId());
		psmt.setString(6, customer.getCustomerAddr());
		psmt.setString(7, customer.getPassword1());
		psmt.setString(8, customer.getRpassword1());
		
		int row_eff = psmt.executeUpdate();
		
		if(row_eff>0)
			return true;
		else
			return false;
	}
		
		public Customer checkCredential(Customer customer)throws SQLException
		{
			PreparedStatement psmt = conn.prepareStatement("select * from Customer where username=? and password1=?");
			
			psmt.setString(1, customer.getUsername());
			psmt.setString(2, customer.getPassword1());
			
			ResultSet rs = psmt.executeQuery();
			
			if(rs.next())
			{
				customer.setCustomerName(rs.getString(1));
			}
			else
			{
				customer=null;
			}
			return customer;
	    }
}
