<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ page import="com.StoreData" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>capture</title>
<style>
h1{color:blue;}
</style>
</head>
<body>
<div align="center">
<br>
<br>
<br>
<h1>Successfully Inserted into the database......</h1>
</div>
<jsp:useBean id="pd" class="com.Product_data" scope="session"/>
	<jsp:setProperty property="*" name="pd"/> 
<%
StoreData.Productdetail(pd);
%>
</body>
</html>
