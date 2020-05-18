package com.lgr.lgrorder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/hello")
    public String login(){
        String s = "orderController";
        return s;
    }

}
