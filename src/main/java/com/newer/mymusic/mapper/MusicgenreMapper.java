package com.newer.mymusic.mapper;

import com.newer.mymusic.domain.Musicgenre;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicgenreMapper {

    @Select("select * from musicgenre where musicalgenre != '全部'")
    public List<Musicgenre> selectAll();
}
