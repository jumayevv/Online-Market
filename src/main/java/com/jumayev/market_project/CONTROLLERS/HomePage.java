package com.jumayev.market_project.CONTROLLERS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @RequestMapping("/api/home")
public class HomePage {
    @GetMapping
    public String home_page(){
        return "welcome home page"  ;
    }
}
