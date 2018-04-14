<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Location</title>
</head>
<body>

<form action="updateLoc" method="post">
	<pre>
	Id: <input type="text" name="id" value=${ location.id } readonly="true">
	Code: <input type="text" name="code" value=${ location.code }>
	Name: <input type="text" name="name" value=${ location.name }>
	Type: 
		Urban<input type="radio" value="urban" name="type" ${ location.type == 'urban'?'checked': '' }>
		Rural<input type="radio" value="rural" name="type" ${ location.type == 'rural'?'checked': '' }>
	<input type="submit" value="save">
	
	</pre>
		
</form>
${ msg }

<a href="displayLocations">View All</a>
</body>
</html>