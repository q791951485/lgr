package com.lgr.lgrcontroller.Controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lgr.lgrcommonservicefacade.Service.UserService.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference
    UserService userService;

    @GetMapping("/dubbo")
    public String login(){
        return userService.helloDubbo();
    }
}
