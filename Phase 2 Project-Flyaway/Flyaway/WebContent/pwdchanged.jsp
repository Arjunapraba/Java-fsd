<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Password Changed</title>
</head>
<body style="background-color:#EBF5FB;">
<div alig="center">
<%
String op=request.getParameter("opwd"); 
String np=request.getParameter("npwd");

if(op!=np){
out.println("Password Changed");
}
else
{
	out.println("Again Change Password");
	response.sendRedirect("changepwd.jsp");
}
%>
</div>
</body>
</html>