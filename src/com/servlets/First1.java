package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class First1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	   	PrintWriter out= response.getWriter();
		String username=request.getParameter("uname");
		String password=request.getParameter("pass");
		String Gmail=request.getParameter("mail");
		String Address=request.getParameter("add");
		//out.println(username+" "+password+" "+Gmail+" "+Address+"<br>");
		//out.println("Welcome to servlet program First1"+"<br>");
			if(username.equals(password)){
				//out.println("Successfully Registered "+username);
				//RequestDispatcher rd=request.getRequestDispatcher("login.html");
				//RequestDispatcher rd=request.getRequestDispatcher("hi");
				RequestDispatcher rd=request.getRequestDispatcher("http://www.fb.com");
				rd.forward(request, response);
				//response.sendRedirect("login.html");
				//response.sendRedirect("http://www.fb.com");
				//response.sendRedirect("hi");
			}else{
			out.println("Please try again");
		}
	}
}
