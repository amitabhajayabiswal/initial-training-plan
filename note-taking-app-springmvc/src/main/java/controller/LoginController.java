package controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Login;
import model.User;
import service.UserService;

@Controller
public class LoginController {
        
    @Autowired
    UserService userService;
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
        
        //String username = request.getParameter("username");
        //String password = request.getParameter("password");
        ModelAndView mav = new ModelAndView();
        mav.addObject("login", new Login());
        return mav;
    }

  @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("login") Login login, Model model) {
    
    ModelAndView mav = null;
    User user = userService.validateUser(login);

    if (null != user) {
      mav = new ModelAndView("welcome");
      mav.addObject("firstname", user.getFirstname());
    } else {
      mav = new ModelAndView("login");
      mav.addObject("message", "Username or Password is wrong!!");
    }

    return mav;
  }
}
