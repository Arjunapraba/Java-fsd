package com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.DB_connection;
/**
 * Servlet implementation class ProductDetails_inDB
 */
@WebServlet("/ProductDetails_inDB")
public class ProductDetails_inDB extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
             
            InputStream in = getServletContext().getResourceAsStream("/WEB-INF/config.properties");
            Properties props = new Properties();
            DB_connection conn = new DB_connection("jdbc:mysql://localhost:3306/products_db", "root", "root");
            Statement stmt = conn.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            
            ResultSet rst = stmt.executeQuery("select * from products_db.list");
            
          
            String pro = request.getParameter("search");
           
            	String sql_res= "select * from products.list where pid=" + pro;
                ResultSet rs = stmt.executeQuery(sql_res);
                
                
                if(rs.next())
                	out.println(rs.getInt("pid") + ": " + rs.getString("product_name") + " " 
                		+ rs.getInt("price"));
                else
                	out.println("There was no element with product ID: " + pro + " found in the table, please try again");
        	
            stmt.close();
            out.println("</body></html>");
            conn.closeConnection();
            }
		catch (ClassNotFoundException e) {
            e.printStackTrace();
		} 
		catch (SQLException e) {
            e.printStackTrace();
		}
		}
}
