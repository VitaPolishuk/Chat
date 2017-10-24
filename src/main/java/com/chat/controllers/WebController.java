package com.chat.controllers;

import com.chat.entities.User;
import com.chat.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

    private UserService userService;

    @Autowired
    public WebController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String example(){
        return "/html/index.html";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public
    String registration(@RequestBody User user) {

        System.out.println(user.getLogin() + " " + user.getPassword());

    return "";
    }
}