package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Product;
import utility.DBConn;

public class ProductDAO 
{
	Connection conn;
	
	public ProductDAO() throws Exception
	{
		conn=DBConn.getMySQLConnection();
	}
	
	public boolean registerProduct(Product product) throws SQLException
	{
		PreparedStatement psmt = conn.prepareStatement("insert into product values(?,?,?,?)");
		
		psmt.setString(1, product.getProductName());
		psmt.setString(2, product.getPrice());
		psmt.setString(3, product.getCategory());
		psmt.setString(4, product.getManufacturer());
		
		int row_eff = psmt.executeUpdate();
		
		if(row_eff>0)
			return true;
		else
			return false;
	}
	
	public Product checkOrder(Product product)throws SQLException
	{
		PreparedStatement psmt = conn.prepareStatement("select * from Product where productName=?");
		
		psmt.setString(1, product.getProductName());
		
		ResultSet rs = psmt.executeQuery();
		
		if(rs.next())
		{
			product.setProductName(rs.getString(1));
		}
		else
		{
			product=null;
		}
		return product;
    }
}
