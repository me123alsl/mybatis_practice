package com.example.mybatis_practice.controller;

import com.example.mybatis_practice.repository.Address;
import lombok.Getter;

@Getter
public class RequestCreateUser {
    private String name;
    private String email;
    private Address address;
    private long teamId;
}
