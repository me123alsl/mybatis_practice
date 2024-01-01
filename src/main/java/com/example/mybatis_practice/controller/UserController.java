package com.example.mybatis_practice.controller;

import com.example.mybatis_practice.service.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/users")
    public ResponseEntity saveUser(@RequestBody RequestCreateUser request) {
        return ResponseEntity.ok(userService.saveUser(request));
    }

    @GetMapping("/users")
    public ResponseEntity getUsers() {
        return ResponseEntity.ok(userService.getUsers());
    }

    @GetMapping("/teams/{teamId}")
    public ResponseEntity getUsersByTeamId(@PathVariable long teamId) {
        return ResponseEntity.ok(userService.getTeam(teamId));
    }

}
