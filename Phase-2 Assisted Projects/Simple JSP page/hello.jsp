<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

 <% 
String a= request.getParameter("A");
String b= request.getParameter("B");
String c= request.getParameter("C");
String d= request.getParameter("D");
int a1 =Integer.parseInt(a);
int b1 =Integer.parseInt(b);
int c1 =Integer.parseInt(c);
int d1 =Integer.parseInt(d);

%>

The sum of A+B+C+D = <%=a1+b1+c1+d1%>
</body>
</html>