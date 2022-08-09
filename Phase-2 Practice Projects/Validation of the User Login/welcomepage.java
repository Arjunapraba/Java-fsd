package loginvalidation;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class welcomepage extends HttpServlet {
	protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("username");
		PrintWriter out = response.getWriter();
		out.println("<h2>Welcome to your Login Page: "+name+"</h2>");
		
		  HttpSession session=request.getSession(); 
		 
		  PrintWriter pwriter = response.getWriter(); 
		  
	      pwriter.print("<br><br><a href='logout1'>Logout</a>");
	      pwriter.close();
		
	}
}



