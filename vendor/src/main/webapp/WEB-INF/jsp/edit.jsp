<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit</title>
</head>
<body>

<form action="editVendor" method="post">
	<p>Name: <input type=text name="name" value=${ vendor.name }></p>
	<p>Code: <input type=text name="code" value=${ vendor.code }></p>
	<p>Type: <select name="type">
			<option ${ vendor.type == 'regular'?'selected': '' }>Regular</option>
			<option ${ vendor.type == 'contract'?'selected': '' }>Contract</option>
		</select>
	</p>
	<p>Email: <input type=text name="email" value=${ vendor.email }></p>
	<p>Address: <input type=text name="address" value=${ vendor.address }></p>
	<p>Phone: <input type=text name="phone" value=${ vendor.phone }></p>
	
	<input type="submit" value="Save!!!!">

</form>

</body>
</html>