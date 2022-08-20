<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin Page</title>
<style>
h1{color:blue;}
h2{color:green;}
</style>
</head>
<body style="background-color:#EBF5FB;">
<div align="center">
<br><br>
<h1>Welcome to the Admin Page</h1>
<h2>Choose an option to view details</h2>
<br><br>
<form action="viewflights.jsp">
<input type="submit" value="Click to view the Airport master Database">
</form>
<br>
<br>
<form action="history.jsp">
<input type="submit" value="Click to view the Users Travel history">
</form>
<br><br>
<form action="changepwd.jsp">
<input type="submit" value="Change Password">
</form>
</div>
</body>
</html>