package com.example.mybatis_practice.repository;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM users WHERE id = #{id}")
    @ResultMap("userMap")
    User findById(Long id);

    @Select("SELECT * FROM users")
    @ResultMap("userMap")
    List<User> findAll();

    @Insert("INSERT INTO users(name, email, country, city, street, zipcode, team_id) " +
            "VALUES(#{name}, #{email}, #{address.country}, #{address.city}, #{address.street}, #{address.zipcode}, #{teamId})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void saveUser(User user);

    @Select("SELECT " +
            "  t.id AS id," +
            "  t.name as name, " +
            "  u.id as USER_ID," +
            "  u.name as USER_NAME," +
            "  u.email as USER_EMAIL," +
            "  u.country as USER_COUNTRY," +
            "  u.street as USER_STREET," +
            "  u.team_id as TEAM_ID " +
            "FROM teams t " +
            "left join users u " +
            "on u.team_id = t.id " +
            "WHERE t.id = #{teamId}")
    @ResultMap("teamMap")
    Team findTeamById(long teamId);
}
