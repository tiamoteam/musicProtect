package com.newer.mymusic.controller;

import com.newer.mymusic.domain.Musicgenre;
import com.newer.mymusic.service.MusicgenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    //查询所有流派信息
    @RequestMapping("/liupaiAll")
    public ResponseEntity<?> liupaiAll(){
        HashMap<String,  List<Musicgenre>> map = new HashMap<>();
        List<Musicgenre> listliupai=musicgenreService.liupaiAll();
        System.out.println(listliupai);

        if(listliupai!=null){
            map.put("data",listliupai);
            return new ResponseEntity<>(map, HttpStatus.OK);
        }
        return new ResponseEntity<>(1,HttpStatus.OK);
    }


    @GetMapping("/drawPic")
    public ResponseEntity<?> drawPic(){
        List<Map<String,Object>> list = new ArrayList<>();
        List<Musicgenre> listliupai = musicgenreService.liupaiAll();//查询所有流派
        for(Musicgenre liupai : listliupai){
            Map<String,Object> map = new HashMap<>();
            map.put("name",liupai.getMusicalgenre());
            map.put("y",liupai.getGenrenum());
            map.put("drilldown",liupai.getMusicalgenre());
            list.add(map);
        }
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

}
