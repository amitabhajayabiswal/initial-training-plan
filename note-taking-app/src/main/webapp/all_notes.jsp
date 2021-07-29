
<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@page import="entities.*"%>

<!DOCTYPE html>
<html>
<head>
<title>All notes: Note Taker</title>
<style>
	.row{
		align-items: center;
		width: 70%;
		border: 3px solid green;
  		padding: 10px;
	}
</style>
</head>
<body>
	<div>
		<%@include file="navbar.jsp"%>
		<br>
		<h1>All Notes:</h1>
		<div class="row">

			<div>
				<%
					Session s = FactoryProvider.getFactory().openSession();
				Query q = s.createQuery("from Note");
				List<Note> list = q.list();
				for (Note note : list) {
				
				%>

				<div >
					<div >
						<h5 ><%= note.getTitle() %></h5>
				
						<p>
						<%= note.getContent() %>
						</p>
						<p><b><%= note.getAddedDate()%></b></p>
						<div>
						<a href="DeleteServlet?note_id=<%= note.getId() %>" >Delete</a>
						<a href="edit.jsp?note_id=<%= note.getId() %>" >Update</a>
						</div>
					</div>
				</div>

				<%
					}
				s.close();
				%>


			</div>

		</div>


	</div>
</body>
</html>