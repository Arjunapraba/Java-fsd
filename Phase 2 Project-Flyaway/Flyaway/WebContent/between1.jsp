<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*, com.mysql.jdbc.Driver"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ page import="com.StoreDetails" %>        
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Between1</title>
</head>
<body>
<jsp:useBean id="fd" class="com.flight_data" scope="session"/>
	<jsp:setProperty property="*" name="fd"/> 
<%
StoreDetails.add(fd);
%>
<% 
String name=request.getParameter("fname");
String address=request.getParameter("address");
String age=request.getParameter("age");
String mob=request.getParameter("mob");
String tickets=request.getParameter("tickets");
String email=request.getParameter("email");
String mobile=request.getParameter("mob");
String county=request.getParameter("country");
String flinum=request.getParameter("fnum");
session.setAttribute("tic",tickets);
session.setAttribute("fname",name);
session.setAttribute("address",address);
session.setAttribute("age",age);
session.setAttribute("mob",mob);
session.setAttribute("email",email);
session.setAttribute("country",county);
session.setAttribute("fnum",flinum);
response.sendRedirect("review.jsp");
%>
 
</body>
</html>