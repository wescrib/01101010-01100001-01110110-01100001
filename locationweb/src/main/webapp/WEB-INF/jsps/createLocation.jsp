<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Location</title>
</head>
<body>

<form action="saveLoc" method="post">
	<pre>
	Id: <input type="text" name="id">
	Code: <input type="text" name="code">
	Name: <input type="text" name="name">
	Type: 
		Urban<input type="radio" value="urban" name="type">
		Rural<input type="radio" value="rural" name="type">
	<input type="submit" value="save">
	
	</pre>
		
</form>
${ msg }

<a href="displayLocations">View All</a>
</body>
</html>