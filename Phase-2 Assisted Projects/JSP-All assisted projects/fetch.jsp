<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="emp" class="com.Entry" scope="session"/>
Record:<br>  
	Employee ID: <jsp:getProperty property="id" name="emp"/><br>  
	Name: <jsp:getProperty property="name" name="emp"/><br>  
	Age: <jsp:getProperty property="age" name="emp" /><br>
	Email: <jsp:getProperty property="email" name="emp" /><br>
	Dept: <jsp:getProperty property="dept" name="emp" /><br> 
</body>
</html>