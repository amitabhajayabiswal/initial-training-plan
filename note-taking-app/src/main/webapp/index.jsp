<!doctype html>
<html lang="en">
<head>
<title>Note Taker : Home page</title>
</head>
<body>
	<!--
	<%
		response.setHeader("cache-control","no-cache,no-store,must-validate");
		if(session.getAttribute("username") == null){
			response.sendRedirect("login.jsp");
		}
	%>-->
	<div class="container">
		<%@include file="navbar.jsp"%>
		<br>
		<div >
			<div >
				<a href="jsp/add_notes.jsp">Start here</a>
			</div>
		</div>
		<!-- Add a login page here-->
	</div>
</body>
</html>