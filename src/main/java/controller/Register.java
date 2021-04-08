package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RegisterDAO;
import model.Customer;

@WebServlet("/Register")

public class Register extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try
		{
			String username = request.getParameter("username");
			String customerName = request.getParameter("customerName");
			String gender = request.getParameter("gender");
			String mobNo = request.getParameter("mobNo");
			String emailId = request.getParameter("emailId");
			String customerAddr = request.getParameter("customerAddr");
			String password1 = request.getParameter("password1");
			String rpassword1 = request.getParameter("rpassword1");
		
			out.println("Username : "+username);
			out.println("Customer Name : "+customerName);
			out.println("Gender : "+gender);
			out.println("Mobile No : "+mobNo);
			out.println("Email Id : "+emailId);
			out.println("Customer Address : "+customerAddr);
			out.println("Password : "+password1);
			out.println("Repeat Password : "+rpassword1);
		
			
			Customer customer = new Customer(username,customerName,gender,mobNo,emailId,customerAddr,password1,rpassword1);
		
			RegisterDAO registerDAO = new RegisterDAO();
		
			if(registerDAO.registerCustomer(customer))
			{
				request.setAttribute("username", customer.getUsername());
				RequestDispatcher dispatch = request.getRequestDispatcher("UserHome.jsp");
				dispatch.forward(request, response);
			}
			else
			{
				request.setAttribute("errorInfo", "Error occured during registering");
				RequestDispatcher dispatch = request.getRequestDispatcher("ErrorPage.jsp");
				dispatch.forward(request, response);
			}
		}
		catch(Exception e)
		{
			request.setAttribute("errorInfo", "Error occured during registering  : "+e.getMessage());
			RequestDispatcher dispatch = request.getRequestDispatcher("ErrorPage.jsp");
			dispatch.forward(request, response);
		}	
	}
}
