package com.newer.mymusic.controller;

import com.newer.mymusic.domain.Musictable;
import com.newer.mymusic.service.MusictableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.List;

@RestController
public class MusictableController {

    @Autowired
    private MusictableService musictableService;

    //查询所有的歌曲信息
    @GetMapping("/selectMt")
    public ResponseEntity<?> FindAll(){
        HashMap<String,List<Musictable>> map = new HashMap<>();
        List<Musictable> musictableList = musictableService.findAll();
        if(musictableList!=null){
            map.put("data",musictableList);
            return new ResponseEntity<>(map, HttpStatus.OK);
        }
        return new ResponseEntity<>(1,HttpStatus.OK);
    }

    @PostMapping("/delbyMt")
    public ResponseEntity<?> delById(@RequestParam("id")int id){
        if(id!=0){
            int a = musictableService.delById(id);
            return new ResponseEntity<>(a,HttpStatus.OK);
        }
        return new ResponseEntity<>(2,HttpStatus.OK);
    }

    @PostMapping("/addMt")
    public ResponseEntity<?> addGJList(@RequestParam(value = "file",required = false) MultipartFile file,
                                       @RequestParam("Musicname")String Musicname,
                                       @RequestParam("Musicalgenre1")String Musicalgenre1,
                                       @RequestParam("Musicalgenre2")String Musicalgenre2,
                                       @RequestParam("Musicalgenre3")String Musicalgenre3,
                                       @RequestParam("Musicalgenre4")String Musicalgenre4,
                                       @RequestParam("Musicintro")String Musicintro,
                                       @RequestParam("Singer")String Singer,
                                       @RequestParam("filetype")String filetype,
                                       @RequestParam("fileName") String fileName){
        String filePath = null;
        if (!file.isEmpty()) {
            try {
                // 文件保存路径
                filePath = "E:/ssm0726/musicProtect/src/main/resources/static/music/"+fileName;
                System.out.println(filePath);
                // 转存文件
                file.transferTo(new File(filePath));
                filePath = "music/"+Musicname+"-"+Singer+filetype;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Musictable mt = new Musictable();
        mt.setMusicname(Musicname);
        mt.setMusicalgenre1(Musicalgenre1);
        mt.setMusicalgenre2(Musicalgenre2);
        mt.setMusicalgenre3(Musicalgenre3);
        mt.setMusicalgenre4(Musicalgenre4);
        mt.setMusicintro(Musicintro);
        mt.setSinger(Singer);
        mt.setMusicurl(filePath);
        int count = musictableService.addMt(mt);
        return new ResponseEntity<>(count,HttpStatus.OK);
    }

}
