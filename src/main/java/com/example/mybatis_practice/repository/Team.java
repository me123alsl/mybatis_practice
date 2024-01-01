package com.example.mybatis_practice.repository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Team {
    private long id;
    private String name;
    private List<User> users = new ArrayList<>();
}
