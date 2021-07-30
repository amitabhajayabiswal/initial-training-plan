<!doctype html>
<html lang="en">
<head>
<title>Login Page</title>

</head>
<body>
    <%
        if(!req.getAttribute('displayMessage')){
            out.println("<h1 style='text-align:center;'>Note is added successfully</h1>");
			out.println("<h1 style='text-align:center;'><a href='all_notes.jsp'>View all notes</a></h1>");
        }
    %>
</body>
</html>