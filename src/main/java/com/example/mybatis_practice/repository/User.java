package com.example.mybatis_practice;

import lombok.Data;

@Data
public class UserDTO {
    private long id;
    private String name;
    private String email;
    private AddressDTO address;
}
