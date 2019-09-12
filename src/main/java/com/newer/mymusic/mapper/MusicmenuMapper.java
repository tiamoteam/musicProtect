package com.newer.mymusic.mapper;

import com.newer.mymusic.domain.Musicmenu;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicmenuMapper {

    //添加歌单
    @Insert("insert into musicmenu(songsheetname,userid) values(#{songsheetname},#{userid})")
    public int addMenu(Musicmenu menu);

    //删除歌单
    @Delete("delete from musicmenu where songsheetid=#{songsheetid}")
    public int delMenu(@Param("songsheetid")Integer songsheetid);
}
