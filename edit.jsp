<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%@ page import="dao.Customerdao"%>
<%@ page import="com.connect"%>
<%@ page import="entity.customer"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Customer</title>
</head>
<body>
	<h2>Edit Customer</h2>
	<%
	String email = request.getParameter("email");
	Customerdao dao = new Customerdao(connect.getConn());
	customer c = dao.editcustomer(email);
	%>
	<form action="update" method="post">
		<label for="first_name">First Name:</label> <input type="text"
			value="<%=c.getFname()%>" name="first_name" required><br>
		<br> <label for="last_name">Last Name:</label> <input type="text"
			value="<%=c.getLname()%>" name="last_name" required><br>
		<br> <label for="street">Street:</label> <input type="text"
			value="<%=c.getStreet()%>" name="street"><br>
		<br> <label for="address">Address:</label> <input type="text"
			value="<%=c.getAddress()%>" name="address"><br>
		<br> <label for="city">City:</label> <input type="text"
			value="<%=c.getCity()%>" name="city"><br>
		<br> <label for="state">State:</label> <input type="text"
			value="<%=c.getState()%>" name="state"><br>
		<br> <label for="email">Email:</label> <input type="text"
			value="<%=c.getEmail()%>" name="email"><br>
		<br> <label for="phone">Phone:</label> <input type="text"
			value="<%=c.getPhone()%>" name="phone"><br>
		<br>
		<button type="submit">Edit Customer</button>
	</form>
</body>
</html>
