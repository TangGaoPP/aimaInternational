package com.example.aimcenter.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.aimcenter.entitiy.UserLogin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserLoginMapper extends BaseMapper<UserLogin> {
    List<UserLogin> getUserList();

    @Select("select username from user_login where login_id =#{loginid}")
    String getUserByName(String loginid);

   /* @Select("select count(1) from user_login where login_id =#{loginid} and psd =#{psd} and username = #{username}")*/
    int IsRegistera( String loginid, String psd);
}
