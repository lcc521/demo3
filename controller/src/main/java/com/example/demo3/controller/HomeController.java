package com.example.demo3.controller;

import com.example.demo3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute(
                "users",
                userService.list());
        return "home";
    }
}
