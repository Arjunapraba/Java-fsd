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
<title>View Details</title>
</head>
<body>
<div align="center">
<h1>Airport Master Database</h1>
</div>
<!-- sql:setDataSource tag -->
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/flyaway"  
     user="root"  password="root"/> 
<table border="2" width="100%">  
<tr> 
<th>Flight Number</th>  
<th>Airlines name</th>   
<th>Ticket price</th>
<th>Source</th>
<th>Destination</th>
<th>Departure time</th>
<th>Arrival Time</th>
<th>Total Seats</th>
<th>Booked Seats</th>
<th>Available Seats</th>
<th>Class</th>  
<sql:query dataSource="${db}" var="rs">  
	SELECT * from Flight_details;  
</sql:query>  
</tr>  
	<c:forEach var="table" items="${rs.rows}"> 
		<tr>
		    <td><c:out value="${table.flight_no}"/></td> 
		    <td><c:out value="${table.airline_name}"/></td>   
			<td><c:out value="${table.price}"/></td>
			<td><c:out value="${table.source_city}"/></td> 
			<td><c:out value="${table.destination_city}"/></td>
			<td><c:out value="${table.dep_time}"/></td>
			<td><c:out value="${table.arrival_time}"/></td>
			<td><c:out value="${table.total_seats}"/></td>
			<td><c:out value="${table.booked_seats}"/></td> 
			<td><c:out value="${table.seat_availability}"/></td>
			<td><c:out value="${table.ticket_type}"/></td>                 
		</tr>  
	</c:forEach>  
</table>     
</body>
</html>