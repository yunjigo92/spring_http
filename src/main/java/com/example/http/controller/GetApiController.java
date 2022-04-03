package com.example.http.controller;

import com.example.http.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api/get")
public class GetApiController {

    @GetMapping(path="/hello") // 경로 path 지정 방법 이렇게도 가능 localhost:8080/api/get/hello
    public String getHello(){
        return "get hello";
    }

    // 이건 예전에 사용하던 방식 !
    @RequestMapping(path = "/hi", method = RequestMethod.GET) // get localhost:8080/api/get/hi
    public String hi() {
        return "hi";
    }

    //path variable 받아서 사용.
    //uri에는 대문자 사용X 길경우 dash로 구분
    // mapping name과 parameter 네임을 일치 시켜야한다.
    // mapping name과 parameter 네임이 다를 경우 path variable name 속성에 추가해주면 된다.
    // ex) http://localhost:8080/api/get/path-variable/java
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name= "name") String pathName){
        System.out.println("path variable "+ pathName);
        return pathName;
    }



    // ex) http://localhost:8080/api/get/query-param?user=yunji&email=yunjigo92@gmail.com&age=30
    @GetMapping("/query-param") // query parameter 를 map 으로 통으로 받는 경우
    public String queryParam(@RequestParam Map<String,String> queryParam){

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey() + "=" + entry.getValue() + "\n");

        });
        return sb.toString();
    }


    // ex) http://localhost:8080/api/get/query-param?user=yunji&email=yunjigo92@gmail.com&age=30
    // 위와 동일한 요청이지만, request param 을 명시적으로 받는 경우
    // 대신 이 경우는 지정한 타입과 다를경우 404에러가 나기도하고, 값이 계속 추가될 경우 추가해야하는 단점이 있다.
    // 따라서 DTO를 받는 방식을 추천.
    @GetMapping("/query-param02")
    public String queryParam02(
        @RequestParam String name,
        @RequestParam String email,
        @RequestParam int age
    ){
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name + "," + email + "," + age;
    }

    // ex) http://localhost:8080/api/get/query-param?user=yunji&email=yunjigo92@gmail.com&age=30
    // 위 두가지 경우에는 RequestMapping annotation을 무조건 붙여야 하지만, 아래처럼 DTO 값일 경우는 붙이지 않아도 Spring에서 처리한다.
    // 주로 실무에서는 DTO를 받는 방식을 많이 사용하며, 추천한다.
    @GetMapping("/query-param03")
    public String queryParam03(UserRequest userRequest)
     {
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }

}

