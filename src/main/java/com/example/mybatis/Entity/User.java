package com.example.mybatis.Entity;

public class User {
    private Long id;
    private String username;
    private String email;

    @Override
    public String toString() {
        return "유저 id : " + id + " " + " 유저 네임 " + username ;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    // Getters and setters
}