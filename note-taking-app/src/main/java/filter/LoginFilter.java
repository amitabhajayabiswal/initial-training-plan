package filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebFilter(value = "/*")
public class LoginFilter implements Filter{

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        HttpSession session = request.getSession(false);

        String username = session.getAttribute("username").toString();
        
        //chain.doFilter(request, response);
        if(username == "Amitabh"){
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        }
        else{
            response.sendRedirect(request.getContextPath() + "/login.jsp");
        }
        
    }
}
