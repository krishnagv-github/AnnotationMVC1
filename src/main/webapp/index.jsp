<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<h2>Hello World!</h2>
	<h3 align="center">Welcome to the Login page!</h3>
	<form:form action="indexSubmit.htm" method="POST" modelAttribute="verify">
		<form:label path="username">Name</form:label>
		<form:input path="username" />
		<form:label path="password">Password</form:label>
		<form:input path="password" />
		<form:button path="Submit" type="submit" />
	</form:form>
</body>
</html>
