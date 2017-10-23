package com.chat.controllers;

import com.chat.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class WebController {

    private UserService userService;

    @Autowired
    public WebController(UserService userService) {
        this.userService = userService;
    }

    public String showHello() {
        return "index";
    }

    @RequestMapping("allUsers")
    public String allUsers() {
        return userService.findAll().toString();
    }
}