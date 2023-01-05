<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>bills</title>
</head>
<body>
	<h2>All Bills</h2>
	<table border=3>
		<tr>
			<td>First Name</td>
			<td>Last Name</td>
			<td>Email</td>
			<td>Mobile</td>
			<td>Product Name</td>
			<td>Quantity</td>
			<td>Amount</td>
		</tr>
		<c:forEach var="bill" items="${bills}">
		<tr>
			<td>${bill.firstName}</td>
			<td>${bill.lastName}</td>
			<td>${bill.email}</td>
			<td>${bill.mobile}</td>
			<td>${bill.product}</td>
			<td>${bill.quantity}</td>
			<td>${bill.amount}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>