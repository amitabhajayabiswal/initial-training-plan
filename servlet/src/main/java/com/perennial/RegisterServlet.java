package com.perennial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/RegisterServlet", initParams = @WebInitParam(name = "foo", value = "Hello"))
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //req.getParameter(name);
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("user_name");
        String password = req.getParameter("user_password");
        String email = req.getParameter("user_email");
        String gender = req.getParameter("gender");

        String condition = req.getParameter("gender");

        resp.setIntHeader("Refresh", 5);

        if(condition == "checked"){
            out.println("<h2> Welcome:" + name + "</h2>");
        }
        else{
            out.println("You have not accepted the terms and conditions");
        }
        out.print("<h2>Welcome to register servlet</h2>");
        out.print(getInitParameter("foo"));
        //Cookie and Session
        //RequestDispatcher rd = req.getRequestDispatcher(path);
    }
    
}
