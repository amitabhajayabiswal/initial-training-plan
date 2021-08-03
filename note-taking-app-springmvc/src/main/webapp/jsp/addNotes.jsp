<%@ page language="java"%>
<!DOCTYPE html>
<html>
<head>
<!--Add metadata later -->
<title>Add Notes</title>
<link rel="stylesheet" href="../css/addNotes.css" />
</head>
<body>
	<%response.setHeader("cache-control","no-cache,no-store,must-validate");%>
	<div class="container">
		<%@include file="navbar.jsp"%>
		<br>
		<h1>Please fill your note detail</h1>
		<br>
		<form action="notes" method="post">
			<div class="custom-form" >
				<label for="title" >Note title</label>
				<input name="title" required type="text" id="title" placeholder="Enter here" />
			</div>
			<div class="custom-form">
				<label for="content">Note Content</label>
				<textarea name="content" required id="content" placeholder="Enter your content here" style="height: 300px;"></textarea>
			</div>

			<div class="add-button">
				<button type="submit">Add</button>
			</div>
		</form>
		
	</div>
</body>
</html>