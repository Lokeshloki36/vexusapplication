<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead</title>
</head>
<body>
	<h2>Create Lead</h2>
	<form action="saveLead" method="post">
		<pre>
			First Name<input type="text" name="firstName">
			Last Name<input type="text" name="lastName">
			Email<input type="email" name="email">
			Mobile<input type="text" name="mobile">
			Source:
			<select name="source">
				<option value="newsPaper">News Paper</option>
				<option value="webinar">Webinar</option>
				<option value="online">Online</option>
				<option value="radio">Radio</option>
			</select>
			<input type="submit" value="save">
		</pre>
	</form>
</body>
</html>