package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Homeservlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
        out.println("<html><body>");
        
        
        String username = request.getParameter("username");
        String age = request.getParameter("age");
        int a=Integer.parseInt(age);
        
        out.println("The Name is "+username+" and Age is "+a);
        
        
        out.println("</body></html>");
	}


}
