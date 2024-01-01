package com.example.mybatis_practice.repository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long id;
    private String name;
    private String email;
    private Address address;
    private long teamId;
}
