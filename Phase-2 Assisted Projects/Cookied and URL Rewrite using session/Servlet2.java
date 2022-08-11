package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.parser.Cookie;

public class Servlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{   
		    PrintWriter out = response.getWriter();  
		      
		    javax.servlet.http.Cookie[] l=request.getCookies();  
		    
		    for(int i=0;i<l.length;i++){  
		    	 out.print("<br>"+l[i].getName()+": "+l[i].getValue());  
		    	} 
	        out.close();  
	         }
		catch(Exception e)
		{
			System.out.println(e);
		} 
	}}




