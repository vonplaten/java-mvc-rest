package com.casimirvonplaten.mvcrest.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("home")
    public String home(HttpServletRequest request){
        System.out.println("asdf----------aaaaaaa");
        return "home.jsp";
    }
}