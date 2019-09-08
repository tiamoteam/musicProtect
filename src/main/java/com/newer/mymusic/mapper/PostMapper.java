package com.newer.mymusic.mapper;

import com.newer.mymusic.domain.Post;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostMapper {

    //查看所有的博客
    @Select("SELECT p.*,ps.name from post p ,personage ps where p.Userid = ps.Userid and p.X = '审核通过'")
    public List<Post> selectAll();

    //根据博客id删除博客
    @Delete("delete from psot where postid = #{Postid}")
    public int delById(@Param("Postid") int Postid);

    //--连表查询博客信息
    //select p.*,Ps.name,pt.* from  personage ps inner join  post p on ps.Userid = p.Userid inner JOIN
    //
    //postprice pt on p.Postid = pt.Postid where p.Userid
    //= 2;
    //
    //--根据userid查看博客内容
    //SELECT pt.*,p.PostContent from Post p INNER JOIN postprice pt on p.Postid = pt.Postid where p.Userid = 2;
}
