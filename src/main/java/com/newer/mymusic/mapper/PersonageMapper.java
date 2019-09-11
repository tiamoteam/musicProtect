package com.newer.mymusic.mapper;

import com.newer.mymusic.domain.Personage;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonageMapper {

    //登录
    @Select("select *from  personage where UserName=#{UserName} and Userpwd=#{Userpwd}")
    public Personage getpersonage(@Param("UserName") String UserName, @Param("Userpwd") String Userpwd);


     //注册
    @Insert("insert into personage(UserName,Userpwd,email) value(#{UserName},#{Userpwd},#{email})")
    public int addPersonage(Personage p);

    //根据用户名查询用户信息
    @Select("select * from personage where UserName = #{UserName}")
    public Personage selectById(@Param("UserName") String UserName);


    //根据用户名修改个人信息
    @Update("UPDATE `personage` SET name=#{name},Address=#{address}," +
            "sex=#{sex},phone=#{phone},age=#{age},email=#{email}," +
            "PersonalSignature=#{personalSignature} WHERE UserName=#{UserName}")
    public  int  updPersonage(Personage updPersonage);

    //查看所有的用户信息
    @Select("select * from personage")
    public List<Personage> selectAll();

    //根据用户id删除用户信息
    @Delete("delete from personage where userid = #{userid}")
    public int delById(@Param("userid") int userid);
}
