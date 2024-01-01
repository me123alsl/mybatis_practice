package com.example.mybatis_practice.service;

import com.example.mybatis_practice.controller.RequestCreateUser;
import com.example.mybatis_practice.repository.Team;
import com.example.mybatis_practice.repository.User;
import com.example.mybatis_practice.repository.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMapper userMapper;

    public User saveUser(RequestCreateUser request) {
        User user = User.builder()
                .email(request.getEmail())
                .name(request.getName())
                .address(request.getAddress())
                .teamId(request.getTeamId())
                .build();
        userMapper.saveUser(user);
        if (user == null) {
            throw new RuntimeException("User not found");
        }
        return user;
    }

    public List<User> getUsers() {
        List<User> userList = userMapper.findAll();
        if (userList == null || userList.isEmpty()) {
            throw new RuntimeException("User not found");
        }
        return userList;
    }

    public Team getTeam(final long teamId) {
        Team team = userMapper.findTeamById(teamId);
        if (team == null) {
            throw new RuntimeException("Team not found");
        }
        return team;
    }
}
