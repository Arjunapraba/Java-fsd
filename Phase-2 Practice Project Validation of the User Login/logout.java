package loginvalidation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class logout extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session=request.getSession(false);
		 PrintWriter pwriter = response.getWriter();
		 pwriter.print("<h1>You have been Logged Out</h1>");
		 pwriter.print("<br><br><a href='login.html'>Click to go Back to Login Page</a>");
	     pwriter.close();
	}

	

}
