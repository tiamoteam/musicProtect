package com.newer.mymusic.mapper;

import com.newer.mymusic.domain.Musictable;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusictableMapper {

    //查询所有歌曲
    @Select("select * from musictable")
    public List<Musictable> findAll();

    //传值：歌曲名字
    public List<Musictable> findByname(@Param("Musicname") String Musicnamer);

    //传值：歌手名字
    public List<Musictable> findBySinger(@Param("Singer") String Singer);

    //上架新歌
    @Insert(" insert into musictable(Musicid,Musicname,Musicalgenre1,Musicalgenre2,Musicalgenre3,Musicalgenre4," +
            " Musicintro,Singer,Musictime,Musicurl) value(0,#{Musicname},#{Musicalgenre1},#{Musicalgenre2}," +
            " #{Musicalgenre3},#{Musicalgenre4},#{Musicintro},#{Singer},SYSDATE(),#{Musicurl})")
    public int addMt(Musictable musictable);

    //下架歌曲
    @Delete("delete from musictable where musicID = #{musicID}")
    public int delById(@Param("musicID") int musicID);

}
