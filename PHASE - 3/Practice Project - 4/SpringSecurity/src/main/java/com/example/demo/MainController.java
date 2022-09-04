package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String disp(){
        return "Without Security...";
    }

    @RequestMapping("/protecteduser")
    public String protectedDisp(){
        return "Hello Saptarshi Mondal...";
    }

    @RequestMapping("/adminuser")
    public String adminDisp(){
        return "Hello Admin...";
    }

}