package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.ProductDAO;
import model.Product;

@WebServlet("/OrderCheck")
public class OrderCheck extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
	
		try
		{
			String productName = request.getParameter("productName");
		
			Product product = new Product();
		
			product.setProductName(productName);
		
			ProductDAO productDAO = new ProductDAO();
			Product  product1 = productDAO.checkOrder(product);
		
			if(product1!=null)
			{
				request.setAttribute("productName", product.getProductName());
				RequestDispatcher dispatch = request.getRequestDispatcher("OrderPlaced.jsp");
				dispatch.forward(request, response);
			}
			else
			{
				request.setAttribute("errorInfo", "Sorry That Product Is Out Of Stock");
				RequestDispatcher dispatch = request.getRequestDispatcher("ErrorPage.jsp");
				dispatch.forward(request, response);			
			}
		}
		
		catch(Exception e)
		{
			request.setAttribute("errorInfo", "Error occured during Ordering Product  : "+e.getMessage());
			RequestDispatcher dispatch = request.getRequestDispatcher("ErrorPage.jsp");
			dispatch.forward(request, response);
		}
	}
}
