package com.example.mybatis.Controller;

import com.example.mybatis.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public String getUserById(@RequestParam Long id){
        return userService.findUserById(id).toString();
    }

    @PostMapping()
    public String setUserInfo(@RequestParam String username,@RequestParam String email) {
        userService.setUser(username,email);
        return "유저 이름 : " + username + "이메일 " + email;
    }
}
