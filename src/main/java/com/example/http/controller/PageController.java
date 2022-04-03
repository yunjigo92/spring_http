package com.example.http.controller;

import com.example.http.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @GetMapping("/main")
    public String main(){
        return "main.html";
    }



    //주로 페이지 컨트롤러에서는 페이지만 내려주는 것이 맞는 방법이지만
    //불가피하게 rest api 응답해줘야될 경우 Response body 로 내려준다.
    //왠만하면 API Controller와 구분해서 사용할 것.
    //Response Entity
    @ResponseBody
    @GetMapping("/user")
    public User user(){
        var user = new User();
        user.setName("윤지");
        user.setAddress("패스트 캠퍼스");
        return user;
    }
}
