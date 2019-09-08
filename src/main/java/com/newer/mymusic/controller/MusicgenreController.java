package com.newer.mymusic.controller;

import com.newer.mymusic.domain.Musicgenre;
import com.newer.mymusic.service.MusicgenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MusicgenreController {

    @Autowired
    private MusicgenreService musicgenreService;

    @GetMapping("selectLP")
    public ResponseEntity<?> selectAll(){
        List<Musicgenre> musicgenreList = musicgenreService.selectAll();
        if(musicgenreList!=null){
            return new ResponseEntity<>(musicgenreList, HttpStatus.OK);
        }
        return new ResponseEntity<>(1,HttpStatus.OK);
    }
}
