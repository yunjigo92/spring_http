package com.example.http.controller;

import com.example.http.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {

    //Json 데이터를 받는 경우 아래처럼 Request body 를 붙여주어야 한다.
    //아래 처럼 map 보다는 DTO를 받는 것을 추천.
    @PostMapping("/post")
    public void post(@RequestBody Map<String,Object> requestData){
        requestData.forEach((key, value) -> {
            System.out.println("key=" + key + " value=" + value);
        });
    }

    //Json 데이터를 받는 경우 아래처럼 Request body 를 붙여주어야 한다.
    //dto 형식
    @PostMapping("/post-dto")
    public void postDto(@RequestBody PostRequestDto postRequestDto){
        System.out.println(postRequestDto);
    }

}
