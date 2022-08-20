<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
<style>
h1{color:red;}
h2{color:green;}
</style>
</head>
<body style="background-color:#EBF5FB;">
<div align="center">
<h1>Welcome to the Login Page</h1>
<h2>Login to book tickets</h2>
<form action="Search.jsp" method="post">
<br>
<br>
Username :<input name="username" type="text" required/>
<br>
<br>
Password :<input name="password" type="password" required/>
<br><br>
<input type="submit" value="Login">
</form>
</div>
</body>
</html>
