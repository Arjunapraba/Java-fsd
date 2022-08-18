<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product details</title>
<style>
h1{color:blue;}
</style>
</head>
<body>
<div align="center">
<h1>Enter the product Details</h1>
<br><br>
<form action="capture.jsp">
Product ID :<input type="number" name="pid"><br><br><br>
Product Name :<input type="text"  name="pname"><br><br><br>
Product price :<input type="number" name="price"><br><br> 
<input type="submit" value="Add to Database">
</form>
</div>
</body>
</html>

