<%@ page language="java"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Notes</title>
<style>
	.custom-form{
		align-items: center;
		width: 70%;
		border: 3px solid green;
  		padding: 10px;
	}
	.add-button{
		align-items: center;
	}
	.container{
		align-items: center;
	}
</style>
</head>
<body>

	<div class="container">
		<%@include file="navbar.jsp"%>
		<br>

		<h1>Please fill your note detail</h1>
		<br>

		<form action="SaveNoteServlet" method="post">
			<div class="custom-form" >
				<label for="title" >Note title</label> 
				<input name="title" required type="text" id="title" aria-describedby="emailHelp" placeholder="Enter here" />
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