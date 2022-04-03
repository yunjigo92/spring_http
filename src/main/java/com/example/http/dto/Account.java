package com.example.http.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Account {

    private String name;
    private int age;

    @JsonProperty("phone_number")
    private String phoneNumber;

    public Account(String name, int age, String phoneNumber){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    //default 생성자
    public Account(){}

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
