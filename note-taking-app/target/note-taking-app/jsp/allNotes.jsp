<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
<%@page import="helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@page import="entities.*"%>

<!DOCTYPE html>
<html>
<head>
<title>All notes: Note Taker</title>
<link rel="stylesheet" href="../css/allNotes.css" />
<!-- move this to seperate css file-->
</head>
<body>
	<div>
		<%@include file="navbar.jsp"%>
		<br>
		<h1>All Notes:</h1>
		<div class="row">
			<div>
				<%
					<jsp:include page="/notes" method=get>	
					List<Note> noteList = (List<Note>)request.getAttribute("list");		
				%>
				<%--
				<div >
					<div class="notes-row">
						<h5 ><%= noteList.getTitle() %></h5>
						<p>
						<%= noteList.getContent() %>
						</p>
						<p><b><%= noteList.getAddedDate()%></b></p>
						<div>
						<a href="DeleteServlet?note_id=<%= note.getId() %>">Delete</a>
						<a href="edit.jsp?note_id=<%= note.getId() %>" >Update</a>
						</div>
					</div>
				</div>
				--%>
			</div>
		</div>
	</div>
</body>
</html>