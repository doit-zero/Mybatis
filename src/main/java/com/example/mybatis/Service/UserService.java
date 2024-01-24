package com.example.mybatis.Service;

import com.example.mybatis.Entity.User;
import com.example.mybatis.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User findUserById(Long userId) {
        return userMapper.findById(userId);
    }

    public void setUser(String username, String email) {
        userMapper.save(username,email);
    }
}