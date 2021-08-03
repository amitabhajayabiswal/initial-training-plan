package com.perennialsys.notetakingspringboot.controller;

import com.perennialsys.notetakingspringboot.model.Login;
import com.perennialsys.notetakingspringboot.model.User;
import com.perennialsys.notetakingspringboot.service.UserService;
import com.perennialsys.notetakingspringboot.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    UserService userService = new UserServiceImpl();

    @GetMapping("/")
    public String show(){
        return "index.jsp";
    }

    @PostMapping("/login")
    public String login(@RequestParam(name="username", required = true) String username, @RequestParam(name="password", required = true) String password){

        String name = username;
        String pass = password;
        Login login = new Login();
        login.setPassword(password);
        login.setUsername(username);
        userService.validateUser(login);
        return "home.jsp";
    }

    @PostMapping("/register")
    public String register(){
        return "register.jsp";
    }

    @PostMapping("/registeruser")
    public String registerUser(@ModelAttribute User user, Model model){

        model.addAttribute("user",user);
        UserService userService = new UserServiceImpl();
        userService.registerUser(user);
        //int value = userService.registerUser(user);
        // if  user is registered then print registered message on the screen and go to login page
        return "login.jsp";
    }


}
