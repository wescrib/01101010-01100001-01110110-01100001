<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<th>ID</th>
		<th>Code</th>
		<th>Name</th>
		<th>Type</th>
		<th>Email</th>
		<th>Phone</th>
		<th>Address</th>
		<th>Actions</th>
	</tr>
	<c:forEach items="${ vendors }" var="v">
	<tr>
		<td>${ v.id }</td>
		<td>${ v.code }</td>
		<td>${ v.name }</td>
		<td>${ v.type }</td>
		<td>${ v.email }</td>
		<td>${ v.phone }</td>
		<td>${ v.address }</td>
		<td><a href="edit?id=${ v.id }">Edit</a> | <a href="delete?id=${ v.id }">Delete</a></td>
	</tr>
	</c:forEach>
</table>
<a href="/vendor">Create Vendor</a>
</body>
</html>