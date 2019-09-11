package com.newer.mymusic.mapper;

import com.newer.mymusic.domain.Post;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostMapper {

    //查看所有审核通过的博客
    @Select("select p.*,Ps.name from  personage ps inner join  post p on ps.Userid = p.Userid where p.X = '审核通过'")
    public List<Post> selectAll();

    //查看所有在审核中的博客
    @Select("select p.*,Ps.name from  personage ps inner join  post p on ps.Userid = p.Userid where p.X = '审核中'")
    public List<Post> selectwAll();

    //根据博客id删除博客
    @Delete("delete from psot where postid = #{Postid}")
    public int delById(@Param("Postid") int Postid);

    //根据id查询一个博客信息
    @Select("select p.*,pt.Pp1 from post p inner join postprice pt on p.Postid = pt.Postid where p.Postid = #{postid};")
    public Post selectBypid(@Param("postid") int postid);

    //审核通过
    @Update("update post set x = '审核通过' where postid = #{postid }")
    public int updatetg(@Param("postid") int postid);

    //审核未通过
    @Update("update post set x = '内容不符合要求' where postid = #{postid }")
    public int updatewtg(@Param("postid") int postid);
    //--连表查询博客信息
    //select p.*,Ps.name,pt.* from  personage ps inner join  post p on ps.Userid = p.Userid inner JOIN
    //
    //postprice pt on p.Postid = pt.Postid where p.Userid
    //= 2;
    //
    //--根据userid查看博客内容
    //SELECT pt.*,p.PostContent from Post p INNER JOIN postprice pt on p.Postid = pt.Postid where p.Userid = 2;
}
