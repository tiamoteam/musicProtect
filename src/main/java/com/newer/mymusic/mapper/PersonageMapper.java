package com.newer.mymusic.mapper;

import com.newer.mymusic.domain.Personage;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonageMapper {

    //登录
    @Select("select *from  personage where UserName=#{UserName} and Userpwd=#{Userpwd}")
    public Personage getpersonage(@Param("UserName") String UserName, @Param("Userpwd") String Userpwd);


     //注册
    @Insert("insert into personage(UserName,Userpwd,email) value(#{UserName},#{Userpwd},#{email})")
    public int addPersonage(Personage p);

}
