<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List,java.util.Scanner,org.springframework.context.ApplicationContext,
    org.springframework.context.support.ClassPathXmlApplicationContext" %>
	<%@page import="com.example.User,com.example.UserDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display here</title>
</head>
<body>
<div align="center">
<form action="update.jsp">
<input type="submit" name="edit" value="Update data"></input>
</form>
<%
String id=(String)request.getAttribute("ID");
ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
User s=ac.getBean(User.class);
UserDAO dao=ac.getBean(UserDAO.class);

List<User> ss=dao.getallstudents(id);
%>
<table>
  <tr><th>id</th><th>name</th><th>email</th></tr>
  <%for(User us:ss){%>
  <tr><td><%=us.getId()%></td><td><%=us.getName()%></td><td><%=us.getEmail()%></td></tr>
  <%} %>
</table>
</div>
</body>
</html>

