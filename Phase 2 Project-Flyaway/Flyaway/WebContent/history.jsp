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
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Booking History of Users</h1>
</div>
<!-- sql:setDataSource tag -->
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/flyaway"  
     user="root"  password="root"/>
<table border="2" width="100%">  
<tr> 
<th>Full Name</th>  
<th>Address</th>   
<th>Age</th>
<th>Mobile Number</th>
<th>Email ID</th>
<th>Country</th>
<th>Flight Number</th>
<th>Ticket Booked</th> 
<th>Date Booked</th>
<sql:query dataSource="${db}" var="rs">  
	SELECT * from Flight_data;  
</sql:query>  
</tr>  
	<c:forEach var="table" items="${rs.rows}"> 
		<tr>
		    <td><c:out value="${table.FULLNAME}"/></td> 
		    <td><c:out value="${table.ADDRESS}"/></td>   
			<td><c:out value="${table.AGE}"/></td>
			<td><c:out value="${table.MOBILE_NUMBER}"/></td> 
			<td><c:out value="${table.EMAIL_ID}"/></td>
			<td><c:out value="${table.COUNTRY}"/></td>
			<td><c:out value="${table.FLIGHT_NUMBER}"/></td>
			<td><c:out value="${table.TICKETS_BOOKED}"/></td>
			<td><c:out value="${table.DATE_BOOKED}"/></td>                
		</tr>  
	</c:forEach>  
</table>          
</body>
</html>