package com.newer.mymusic.mapper;

import com.newer.mymusic.domain.Admin;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminMapper {

    //登录
    @Select("select *from admin where aname=#{aname} and pwd=#{pwd}")
    public Admin getAdmin(@Param("aname") String aname, @Param("pwd") String pwd);


     //添加
    @Insert("insert into admin(aname,pwd,quanxian,dltime) value(#{aname},#{pwd},#{quanxian},SYSDATE())")
    public int addAdmin(Admin a);

    //根据修改密码
    @Update("update admin set pwd=#{pwd} where aname=#{aname}")
    public int updPwd(Admin a);

    //根据用户名查询用户信息
    @Select("select * from admin where aname = #{aname}")
    public Admin selectById(@Param("aname") String aname);

    //查询所有管理员信息
    @Select("select * from admin")
    public List<Admin> selectAll();

    @Update("update Admin set enable ='已启用' where aname = #{aname}")
    public int updEnableqy( @Param("aname") String aname);

    @Update("update Admin set enable ='已禁用' where aname = #{aname}")
    public int updEnablejy(@Param("aname") String aname);

    @Delete("delete from Admin where id = #{id}")
    public int delById(@Param("id") int id);

}
