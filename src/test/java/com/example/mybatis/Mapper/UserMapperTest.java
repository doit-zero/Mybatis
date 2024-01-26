//package com.example.mybatis.Mapper;
//
//import com.example.mybatis.Entity.User;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.transaction.annotation.Transactional;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//@Transactional
//class UserMapperTest {
//
//    @Autowired
//    private UserMapper userMapper;
//
//    @Test
//    public void testSaveUser() {
//        // 새로운 사용자 생성
//        User newUser = new User("test","test@test.com");
//
//        // save 메소드를 통해 사용자 저장
//        userMapper.save(newUser.getUsername(), newUser.getEmail());
//
//        // 저장된 사용자의 ID를 확인
//        assertNotNull(newUser.getId());
//
//        // 저장된 사용자를 다시 조회
//        User savedUser = userMapper.findById(newUser.getId());
//
//        // 조회된 사용자와 초기에 생성한 사용자가 일치하는지 확인
//        assertEquals(newUser.getId(), savedUser.getId());
//        assertEquals(newUser.getUsername(), savedUser.getUsername());
//        assertEquals(newUser.getEmail(), savedUser.getEmail());
//    }
//}