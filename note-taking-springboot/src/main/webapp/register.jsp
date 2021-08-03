<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<form action="registeruser">
	    <table>
	        <tr>
	            <td><label>Username: </label></</td>
	            <td><input type="text" required name="username"></input></td>
	        </tr>
	        <tr>
	            <td><label>Password: </label></</td>
                <td><input type="password" required name="password"></input></td>
            </tr>
	        <tr>
	            <td><label>First name: </label></</td>
                <td><input type="name" required name="firstname"></input></td>
            </tr>
            <tr>
                <td><label>Last name: </label></</td>
                <td><input type="name" required name="lastname"></input></td>
            </tr>
            <tr>
                <td><label>email: </label></</td>
                <td><input type="email" required name="email"></input></td>
            </tr>
            <tr>
                <td><label>Address: </label></</td>
                <td><input type="text" required name="address"></input></td>
            </tr>
            <tr>
                <td><label>Phone: </label></</td>
                <td><input type="number" required name="phone"></input></td>
            </tr>
            <tr>
            	<td></td>
            	<td><button id="register" name="register">Register</button></td>
            </tr>
            <tr></tr>
            <tr>
                <td></td>
            	<td><a href="home.jsp">Home</a></td>
            </tr>
	    </table>

	</form>
</body>
</html>