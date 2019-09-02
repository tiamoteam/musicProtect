package com.newer.mymusic.service;

import com.newer.mymusic.domain.Musictable;
import com.newer.mymusic.mapper.MusictableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusictableService {
    @Autowired
    private MusictableMapper musictableMapper;

    public List<Musictable> findAll(){
        return musictableMapper.findAll();
    }

    public List<Musictable> findByname(String Musicname){
        return musictableMapper.findByname(Musicname);
    }

    public List<Musictable> findBySinger(String Singer){
        return musictableMapper.findByname(Singer);
    }
}
