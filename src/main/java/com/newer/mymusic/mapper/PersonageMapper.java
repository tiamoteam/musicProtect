package com.newer.mymusic.mapper;

import com.newer.mymusic.domain.personage;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonageMapper {

    //登录
    @Select("select *from  personage where UserName=#{UserName} and Userpwd=#{Userpwd}")
    public personage getpersonage(@Param("UserName") String UserName, @Param("Userpwd") String Userpwd);


     //注册
    @Insert("insert into personage(UserName,email,Userpwd) values(#{UserName},#{email},#{Userpwd})")
    public int addPersonage(personage p);

}
