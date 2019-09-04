package com.newer.mymusic.mapper;

import com.newer.mymusic.domain.Admin;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminMapper {

    //登录
    @Select("select *from admin where aname=#{aname} and pwd=#{pwd}")
    public Admin getAdmin(@Param("aname") String aname, @Param("pwd") int pwd);

     //添加
    @Insert("insert into admin(aname,pwd) value(#{aname},#{pwd})")
    public int addAdmin(Admin a);

    //根据修改密码
    @Update("update admin set pwd=#{pwd} where aname=#{aname}")
    public int updPwd(@Param("aname") String aname, @Param("pwd") int pwd);
    //根据用户名查询用户信息
    @Select("select * from admin where aname = #{aname}")
    public Admin selectById(@Param("aname") String aname);

}
