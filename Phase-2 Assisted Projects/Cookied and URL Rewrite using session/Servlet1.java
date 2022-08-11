package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{    
		    PrintWriter out = response.getWriter();  
		          
		    String n=request.getParameter("username"); 
		    String p=request.getParameter("password"); 
		    out.print("Welcome "+ n);  
		  
		    Cookie ck=new Cookie("username",n);			
		    Cookie k=new Cookie("password",p);
		    response.addCookie(ck);
		    response.addCookie(k);                
		  
		    //creating submit button  
		    out.print("<form action='serv2'>");  
		    out.print("<input type='submit' value='go'>");  
		    out.print("</form>");  
		          
		    out.close();  
		  
		        }catch(Exception e){System.out.println(e);}  
		  }   
	}

	
