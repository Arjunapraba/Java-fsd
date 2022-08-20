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
<title>Completed Booking</title>
<style>
h1{color:#7D3C98;}
</style>
</head>
<body style="background-color:#EBF5FB;">
<div align="center">
<br>
<h1>Hurrah!! You have Successfully completed your Booking</h1>
<br>
<h2>Details of Booking</h2>
<div align="center">
<br>
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
Starting Journey   :<c:out value="${dep }"/>
<br>
<br>
Destination   :<c:out value="${arr}"/>
<br>
<br>
Number of tickets   :<c:out value="${tic}"/>
<br>
<br>
Booking cost  :<%out.println("Rs.");%><c:out value="${tic*2500}"/><br><br>
<form action="Start.jsp">
<input type="submit" value="Click here to Logout">
<br><br><br>
</form>
</div>
</body>
</html>