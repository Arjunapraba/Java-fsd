package loginvalidation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Userlogin extends HttpServlet {
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
        out.println("<html><body>");
		String username = request.getParameter("username");
		String password =request.getParameter("password");
		
		if("Arjunkumar".equals(username) && "Mypwd@123".equals(password))
		{
			RequestDispatcher dis = request.getRequestDispatcher("welcome");
			dis.forward(request,response);
		}
		else{
			RequestDispatcher dis = request.getRequestDispatcher("login.html");
			dis.include(request, response);
			out.println("<br>Invalid username or password.....Retry Again");
		}
		out.println("</body></html>");
	}

	

}
