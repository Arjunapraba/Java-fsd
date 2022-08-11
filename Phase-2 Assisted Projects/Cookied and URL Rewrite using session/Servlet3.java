package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet3 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String n=request.getParameter("username"); 
	    String p=request.getParameter("password"); 
	    String e=request.getParameter("email"); 
	    String c=request.getParameter("country");
	    String a=request.getParameter("age");
	    PrintWriter pwriter = response.getWriter();
	    HttpSession session=request.getSession();
	    session.setAttribute("username",n);
	    session.setAttribute("password",p);
	    session.setAttribute("email",e);
	    session.setAttribute("country",c);
	    session.setAttribute("age",a);
	
	    pwriter.print("<a href='serv4'>view details</a>");
	    pwriter.close();
	   
	}

}
