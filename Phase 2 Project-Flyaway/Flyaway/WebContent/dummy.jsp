<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*, com.mysql.jdbc.Driver"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>          
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body style="background-color:#EBF5FB;">
<div align="center">
<h1>Booking Details</h1>
<h2>***Pay to Book Your Tickets***</h2>
<br>
<br>
</div>
<div align="center">
Booking Name :<c:out value="${fname}"/>
<br>
<br>
Mobile Number :<c:out value="${mob}"/>
<br>
<br>
Flight Number :<c:out value="${fnum}"/>
<br>
<br>
Email ID   :<c:out value="${email}"/>
<br>
<br>
Booking cost  :<%out.println("Rs."); %><c:out value="${tic*2500}"/>
<br>
<br>
<form action="complete.jsp">
<input type="submit" value="Pay and complete Booking">
</form>
</div>
</body>
</html>