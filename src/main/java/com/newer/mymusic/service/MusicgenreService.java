package com.newer.mymusic.service;

import com.newer.mymusic.domain.Musicgenre;
import com.newer.mymusic.mapper.MusicgenreMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicgenreService implements MusicgenreMapper {
    @Autowired
    private MusicgenreMapper musicgenreMapper;
    @Override
    public List<Musicgenre> selectAll() {
        return musicgenreMapper.selectAll();
    }

    public List<Musicgenre> liupaiAll() {
        return musicgenreMapper.liupaiAll();
    }
}
