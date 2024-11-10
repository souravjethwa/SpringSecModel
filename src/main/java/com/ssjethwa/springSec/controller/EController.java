package com.ssjethwa.springSec.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/ecommerce")
public class EController {

    @GetMapping("")
    public String welcome(HttpServletRequest request){
        return "Welcome to Sourav's E-Service"+ request.getSession().getId();
    }
}
