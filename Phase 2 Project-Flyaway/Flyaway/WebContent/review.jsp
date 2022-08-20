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
<title>Review and Add</title>
</head>
<body>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/flyaway"  
     user="root"  password="root"/>

<c:set var="t" value="${tic}"/>
<c:set var="f" value="${fnum}"/>

	<sql:update dataSource="${db}" var="rs"> 
     UPDATE flight_details SET seat_availability = seat_availability - ?, booked_seats = booked_seats + ? WHERE flight_no= ?
	<sql:param value= "${t}"/>
	<sql:param value= "${t}"/>
	<sql:param value= "${f}"/>  
    </sql:update>
    <%response.sendRedirect("dummy.jsp");%>
</body>
</html>