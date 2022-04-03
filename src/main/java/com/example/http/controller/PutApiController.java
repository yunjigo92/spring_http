package com.example.http.controller;


import com.example.http.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class PutApiController {

    @PutMapping("/put")
    public PutRequestDto put(@RequestBody PutRequestDto putRequestDto){
        System.out.println(putRequestDto);
        return putRequestDto;
    }


    @PutMapping("/put/{userId}")
    public PutRequestDto put(@RequestBody PutRequestDto putRequestDto, @PathVariable Long userId){
        System.out.println(userId);
        System.out.println(putRequestDto);
        return putRequestDto;
    }
}
