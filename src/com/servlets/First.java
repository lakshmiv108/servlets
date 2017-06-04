package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;


@WebServlet("/First")
public class First extends GenericServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter out= res.getWriter();
		String username=req.getParameter("uname");
		String password=req.getParameter("pass");
		String Gmail=req.getParameter("mail");
		String Address=req.getParameter("add");
		out.println(username+" "+password+" "+Gmail+" "+Address+"<br>");
		out.println("Welcome to servlet program");
		
	}
       
    
    

}
