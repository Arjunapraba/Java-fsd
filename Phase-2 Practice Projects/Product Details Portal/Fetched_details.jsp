<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FETCHED DETAILS</title>
<style>
h1{color:blue;}
</style>
</head>
<body style="text-align:center">
<h1>Fetched Product details </h1>
<jsp:useBean id="pro" class="com.capture_details" scope="session"/>
	<jsp:setProperty property="*" name="pro"/>
	
Product details :<br> <br> 
Product ID      : <jsp:getProperty property="pid" name="pro"/><br> <br> 
Product Name    : <jsp:getProperty property="pname" name="pro"/><br><br>  
Warranty        : <jsp:getProperty property="warranty" name="pro" /><br><br>
Ratings         : <jsp:getProperty property="rating" name="pro" /><br><br>
Price           : <jsp:getProperty property="price" name="pro" /><br> <br>
</body>
</html>
