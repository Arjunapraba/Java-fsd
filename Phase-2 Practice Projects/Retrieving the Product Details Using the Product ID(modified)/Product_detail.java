package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Product_detail extends HttpServlet {
	// JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/products_db";
    private static final String user = "root";
    private static final String password = "root";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int p=Integer.parseInt(request.getParameter("pid"));
		 PrintWriter out=response.getWriter();
		String query1= "select * from list where pid="+p;
    	

  	  try {     	
      	try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}  	
          // opening database connection to MySQL server
          con = DriverManager.getConnection(url, user, password);

          // getting Statement object to execute query
          stmt = con.createStatement();

  	     rs = stmt.executeQuery(query1); 
  	
         boolean i=rs.next();
         if(i==true)
         {
  	      out.println("Product Id :"+rs.getInt(1)+"<br>Product name :"+rs.getString(2)+"<br>Product price :"+rs.getInt(3));
         }
         else
         {
      	   out.println("Product Detail is not found");
         }
     }
  	catch (SQLException sqlEx) {
          sqlEx.printStackTrace();
      } finally {
          //close connection ,stmt and resultset here
          try { con.close(); } catch(SQLException se) { /*can't do anything */ }
          try { stmt.close(); } catch(SQLException se) { /*can't do anything */ }
          try { rs.close(); } catch(SQLException se) { /*can't do anything */ }
      }
	}
}
