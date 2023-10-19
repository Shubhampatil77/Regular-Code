<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%@ page import="dao.Customerdao"%>
<%@ page import="com.connect"%>
<%@ page import="entity.customer"%>
<%@ page import="java.util.List"%>


<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}
</style>
<meta charset="UTF-8">
<title>Customer List</title>
</head>
<body>
	<h1>Customer List</h1>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Street</th>
			<th>Address</th>
			<th>City</th>
			<th>State</th>
			<th>Email</th>
			<th>Phone</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>

		<%
		Customerdao dao = new Customerdao(connect.getConn());
		List<customer> list = dao.getallcustomer();
		for (customer c : list) {
		%>
		<tr>
			<td><%=c.getFname()%></td>
			<td><%=c.getLname()%></td>
			<td><%=c.getStreet()%></td>
			<td><%=c.getAddress()%></td>
			<td><%=c.getCity()%></td>
			<td><%=c.getState()%></td>
			<td><%=c.getEmail()%></td>
			<td><%=c.getPhone()%></td>
			<td><a href="edit.jsp?email=<%=c.getEmail()%>"><button type="button">Edit Customer</button></a></td>
			<td><a href="delete?email=<%=c.getEmail()%>"><button type="button">Delete Customer</button></a></td>
		</tr>
		
		<%
		}
		%>
	</table>
	<a href="add.jsp"><button type="button">Add Customer</button></a>
	
</body>
</html>
