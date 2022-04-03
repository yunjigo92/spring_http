package com.example.http.controller;

import com.example.http.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


//다양한 response 형태를 알아보자
@RestController
@RequestMapping("/api")
public class ApiController {

    //단순 text 리턴
    @GetMapping("/text")
    public String text(@RequestParam String account){
        return account;
    }

    //Json 리턴
    // req -> object mapper -> object -> method -> object -> object mapper -> json -> response
    @PostMapping("/json")
    public User json(@RequestBody User user){
        return user;
    }

    //응답코드 및 응답 값을 설정해서 리턴해야 하는 경우
    @PutMapping("/put/json")
    public ResponseEntity put(@RequestBody User user){
      return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

}
