package com.newer.mymusic.service;

import com.newer.mymusic.domain.Musicmenu;
import com.newer.mymusic.mapper.MusicmenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicmenuService {

    @Autowired
    private MusicmenuMapper musicmenuMapper;

    public int addMenu(Musicmenu menu){
        return musicmenuMapper.addMenu(menu);
    }

    public int delMenu(Integer songsheetid){
        return musicmenuMapper.delMenu(songsheetid);
    }
}
