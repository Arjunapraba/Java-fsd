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
<div align="center">
<jsp:useBean id="emp" class="com.Entry" scope="session"/>
	<jsp:setProperty property="*" name="emp"/>  
	
	<a href=fetch1.jsp>Logout</a><br><br>
	<a href=fetch.jsp>Fetch Data</a>
	</div>
</body>
</html>