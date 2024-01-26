package com.example.mybatis.Mapper;

import com.example.mybatis.Entity.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM users WHERE id = #{id}")
    User findById(@Param("id") Long id);

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("INSERT INTO users (username, email) VALUES (#{username}, #{email})")
    void save(String username, String email);

    @Update("UPDATE users SET username = #{username}, email = #{email} WHERE id = #{id}")
    void update(User user);

    @Delete("DELETE FROM users WHERE id = #{id}")
    void delete(@Param("id") Long id);


}
