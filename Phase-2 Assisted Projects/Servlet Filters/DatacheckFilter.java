package com;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class DatacheckFilter
 */
@WebFilter("/DatacheckFilter")
public class DatacheckFilter implements Filter {

    /**
     * Default constructor. 
     */
    public DatacheckFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String n = request.getParameter("username");
		String p = request.getParameter("age");
		  int a=Integer.parseInt(p);
		 if("admin".equals(n) && a==30){
			 
		  chain.doFilter(request, response);
		}
		 else{
		
		 System.out.println("\nInvalid Credentials");
		 }
		}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
