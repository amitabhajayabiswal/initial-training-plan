<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<form action="login" method="post">
	    <label>Username: </label>
        <input type="text" placeholder="Enter text here" name="username"/>
        <label>Password: </label>
        <input type="password" placeholder="Enter text here" name="password"/>
        <button type="submit">Submit</submit>
	</form>
</body>
</html>