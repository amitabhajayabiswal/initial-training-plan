package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.NotesDAO;
import entities.Note;

@WebServlet(value = "/notes")
public class SaveNoteServlet extends HttpServlet {

	NotesDAO dao = new NotesDAO();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			
			Note note = new Note(title, content, new Date());
			dao.addNotes(note);
			
			response.setContentType("text/html");
			request.setAttribute("displayMessage", "Note is added successfully");

			PrintWriter out=response.getWriter();

			out.println("<h1 style='text-align:center ;'>Note is added successfully</h1>");
			out.println("<h1 style='text-align:center ; '> <a href='all_notes.jsp'>View all notes</a> </h1>");
	}

	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int noteId=Integer.parseInt(request.getParameter("note_id").trim());
		dao.deleteNotes(noteId);		
		response.sendRedirect("all_notes.jsp");

	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String title=req.getParameter("title");
		String content=req.getParameter("content");
		int noteId=Integer.parseInt(req.getParameter("noteId").trim());
		dao.updateNotes(noteId, title, content);
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Note> list = dao.getNotesList();
		req.setAttribute("list", list);
		req.getRequestDispatcher("demo/all_notes.jsp").forward(req, resp);
	}
}
