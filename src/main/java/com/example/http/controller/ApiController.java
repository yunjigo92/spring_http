package com.example.http.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // rest api 사용
@RequestMapping("/api") // request mapping 설정
public class ApiController {

    @GetMapping("/hello")
    public String hello(){
        return "hello spring api ! ";
    }
}
