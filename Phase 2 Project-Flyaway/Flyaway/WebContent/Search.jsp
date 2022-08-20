<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search for Flights</title>
<style>
h1{color:blue;}
h2{color:red;}
</style>
</head>
<body style="background-color:#EBF5FB;">
<div align="center">
<h1>Welcome to the Ticket Booking Portal</h1>
<h2>Enter your required date and destination for travel</h2>
<form action="between.jsp">
Booking name: <input name="bname" required/>
<br><br>
Enter the Date :<input name="date" >
<br><br><br>
<label for="Sloc">Source Location : </label>
<select name="Sloc" >
<option value="Bangalore">Bangalore</option>
<option value="Delhi">Delhi</option>
<option value="Mumbai">Mumbai</option>
<option value="Pune">Pune</option>
<option value="Chennai">Chennai</option>
</select><br><br>
<label for="Dloc">Destination : </label>
<select name="Dloc" >
<option value="Delhi">Delhi</option>
<option value="Mumbai">Mumbai</option>
<option value="Pune">Pune</option>
<option value="Chennai">Chennai</option>
<option value="Bangalore">Bangalore</option>
</select><br><br><br>

<br><br>
<input type="submit" value="Click to Continue Booking">
</form>
</div>
</body>
</html>