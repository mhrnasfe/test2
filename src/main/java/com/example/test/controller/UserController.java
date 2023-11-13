package com.example.test.controller;

import com.example.test.service.imp.UserServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserServiceImp userService;

    @GetMapping("/home")
    public ModelAndView home() {
        return new ModelAndView("home");
    }

    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView view = new ModelAndView();
        view.addObject("loginMessage", "Please enter your credentials");
        view.setViewName("login");
        return view;
    }

}
