package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;




public class Servlet4 extends HttpServlet {
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 HttpSession session=request.getSession(false);
	 PrintWriter pwriter = response.getWriter();
     String myName=(String)session.getAttribute("username");
     String myPass=(String)session.getAttribute("password");
     String myage=(String)session.getAttribute("age");
     String mymail=(String)session.getAttribute("email");
     String mycountry=(String)session.getAttribute("country");
     pwriter.print("Name: "+myName+"<br>Pass: "+myPass+"<br>");
     pwriter.print("Age: "+myage+"<br>Email: "+mymail+" <br>");
     pwriter.print("Country: "+mycountry+"<br>");
     pwriter.println("session creation time :" + session.getCreationTime()+" <br>");
     pwriter.println("session last accessed time :" +session.getLastAccessedTime());
	}


}
