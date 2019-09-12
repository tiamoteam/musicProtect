package com.newer.mymusic.controller;

import com.newer.mymusic.domain.Musicmenu;
import com.newer.mymusic.service.MusicmenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicmenuController {

    @Autowired
    private MusicmenuService musicmenuService;

    @RequestMapping("/addMusicmenu")
    public ResponseEntity<?> addMenu(Musicmenu menu){

        int count=musicmenuService.addMenu(menu);

        return new ResponseEntity<>(count ,HttpStatus.OK);
    }

}
