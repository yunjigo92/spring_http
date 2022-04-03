package com.example.http.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostRequestDto {

    private String account;
    private String email;
    private String address;
    private String password;

    //이렇게 Json 요청시 스네이크 케이스인 경우는 JsonProperty 어노테이션을 사용해서 설정 후 가능하다.
    @JsonProperty("phone_number")
    private String phoneNumber; //

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "PostRequestDto{" +
                "account='" + account + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
