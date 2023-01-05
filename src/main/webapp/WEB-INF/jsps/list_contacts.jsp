<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contacts</title>
</head>
<body>
	<h2>List of Contacts</h2>
	<table border=2>
		<tr>
			<td>FirstName</td>
			<td>LastName</td>
			<td>Email</td>
			<td>Mobile</td>
			<td>Source</td>
			<td>Billing</td>
		</tr>
	<c:forEach var="contact" items="${contacts}">
		<tr>
			<td>${contact.firstName}</td>
			<td>${contact.lastName}</td>
			<td>${contact.email}</td>
			<td>${contact.mobile}</td>
			<td>${contact.source}</td>
			<td><a href="createBill?id=${contact.id}">billing</a></td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>