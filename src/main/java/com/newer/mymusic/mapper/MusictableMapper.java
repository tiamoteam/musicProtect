package com.newer.mymusic.mapper;

import com.newer.mymusic.domain.Musictable;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusictableMapper {

    //查询所有歌曲
    public List<Musictable> findAll();

    //传值：歌曲名字
    public List<Musictable> findByname(@Param("Musicname") String Musicnamer);

    //传值：歌手名字
    public List<Musictable> findBySinger(@Param("Singer") String Singer);

}
