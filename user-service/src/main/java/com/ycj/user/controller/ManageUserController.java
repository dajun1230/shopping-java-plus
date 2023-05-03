package com.ycj.user.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/manager")
public class ManageUserController {

    @GetMapping("/hello")
    public String hello() {
        return "OK";
    }
}
