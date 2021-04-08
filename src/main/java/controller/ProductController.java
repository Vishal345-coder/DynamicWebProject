package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.ProductDAO;
import model.Product;

@WebServlet("/ProductController")
public class ProductController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			try
			{
				String productName = request.getParameter("productName");
				String price = request.getParameter("price");
				String category = request.getParameter("category");
				String manufacturer = request.getParameter("manufacturer");
			
			
				out.println("Product Name : "+productName);
				out.println("Price : "+price);
				out.println("Category : "+category);
				out.println("Manufacturer : "+manufacturer);
				
				Product product = new Product(productName,price,category,manufacturer);
			
				ProductDAO productDAO = new ProductDAO();
			
				if(productDAO.registerProduct(product))
				{
					request.setAttribute("productName", product.getProductName());
					RequestDispatcher dispatch = request.getRequestDispatcher("ProductAdd.jsp");
					dispatch.forward(request, response);
				}
				else
				{
					request.setAttribute("errorInfo", "Error occured during Adding Product");
					RequestDispatcher dispatch = request.getRequestDispatcher("ErrorPage.jsp");
					dispatch.forward(request, response);
				}
			}
			catch(Exception e)
			{
				request.setAttribute("errorInfo", "Error occured during Adding Product  : "+e.getMessage());
				RequestDispatcher dispatch = request.getRequestDispatcher("ErrorPage.jsp");
				dispatch.forward(request, response);
			}
	}	
}


