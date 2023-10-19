<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Customer</title>
</head>
<body>

	<h2>Add New Customer</h2>
	<%-- 	<c: if test="${not empty succMsg }">
	<p class="text">${succMsg }</p>
	<c:remove var:"succMsg"/>
	</c:>
	
	<c: if test="${not empty errorMsg }">
	<p class="text">${succMsg }</p>
	<c:remove var:"errorMsg"/>
	</c:>
 --%>

	<form action="Register1" method="post">
		<label for="first_name">First Name:</label> <input type="text"
			id="first_name" name="first_name" required><br> <br>
		<label for="last_name">Last Name:</label> <input type="text"
			id="last_name" name="last_name" required><br> <br>
		<label for="street">Street:</label> <input type="text" id="street"
			name="street"><br> <br> <label for="address">Address:</label>
		<input type="text" id="address" name="address"><br> <br>
		<label for="city">City:</label> <input type="text" id="city"
			name="city"><br> <br> <label for="state">State:</label>
		<input type="text" id="state" name="state"><br> <br>
		<label for="email">Email:</label> <input type="text" id="email"
			name="email"><br> <br> <label for="phone">Phone:</label>
		<input type="text" id="phone" name="phone"><br> <br>

		<button type="submit">Add Customer</button>
		<a href="index.jsp"><button type="button">List</button></a>

	</form>
</body>
</html>




</body>
</html>