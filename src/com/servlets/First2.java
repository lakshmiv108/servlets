package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/First2")
public class First2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

 		PrintWriter out= response.getWriter();
		String username=request.getParameter("uname");
		String password=request.getParameter("pass");
		String Gmail=request.getParameter("mail");
		String Address=request.getParameter("add");
		out.println(username+" "+password+" "+Gmail+" "+Address+"<br>");
		out.println("Welcome to servlet program First2");	
	}

}
