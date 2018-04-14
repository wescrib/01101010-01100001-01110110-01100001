<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Vendor</title>
</head>
<body>

<h1>Create a vendor</h1>

<form action="createVendor" method="post">
	<p>Name: <input type=text name="name"></p>
	<p>Code: <input type=text name="code"></p>
	<p>Type: <select name="type">
			<option>Regular</option>
			<option>Contract</option>
		</select>
	</p>
	<p>Email: <input type=text name="email"></p>
	<p>Address: <input type=text name="address"></p>
	<p>Phone: <input type=text name="phone"></p>
	
	<input type="submit" value="Save!!!!">

</form>
${ msg }

<a href="displayAll">All Vendors</a>
</body>
</html>