package com.lgr.lgruser.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hello")
    public String login(){
        String s = "aaaa";
        return s;
    }
}