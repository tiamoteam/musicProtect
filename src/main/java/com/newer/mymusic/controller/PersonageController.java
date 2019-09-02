package com.newer.mymusic.controller;

import com.newer.mymusic.domain.Personage;

import com.newer.mymusic.domain.Musictable;
import com.newer.mymusic.mapper.MusictableMapper;
import com.newer.mymusic.service.PersonageService;
import com.newer.mymusic.util.JwtTokenUtil;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonageController {

    @Autowired
    private PersonageService personageService;
    @Autowired
    private MusictableMapper musictableMapper;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Value("${auth.header}") //去application.yml 获取auth.header的值
    private String header;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam("UserName")String UserName, @RequestParam("Userpwd")String Userpwd){
        int msg = 0;
        Personage a = personageService.getpersonage(UserName,Userpwd);

            if (a != null ) {
                String token = jwtTokenUtil.createJwt(UserName);
                System.out.println(token);
                return new ResponseEntity<>(token, HttpStatus.OK);
            }
        else{
            return new ResponseEntity<>(msg,HttpStatus.OK);
        }
    }

    @PostMapping("/zhuce")
    public ResponseEntity<?> zhuce(Personage p){
       int flous=0;
        Personage p1;
       if ((p1=personageService.selectById(p.getUserName()))!=null){
           flous=2;
           return new ResponseEntity<>(flous,HttpStatus.OK);
       }else if (p!=null){
           flous=personageService.addPersonage(p);
            return new ResponseEntity<>(flous,HttpStatus.OK);
        }else {
            return new ResponseEntity<>(flous,HttpStatus.OK);
       }
    }

    @RequestMapping("/check")
    public ResponseEntity<?> check(HttpServletRequest request){
        String token = request.getHeader(header);
        if(token!=null){
            Claims claims = jwtTokenUtil.parseJWT(token);
            System.out.println(token);
            Personage p = personageService.selectById(claims.getIssuer());
            return new ResponseEntity<>(p,HttpStatus.OK);
        }else{
            return new ResponseEntity<>("fail",HttpStatus.OK);
        }
    }

//搜索歌曲
    @PostMapping("/search")
    public ResponseEntity<?> search(@RequestParam("searchAll")String searchAll){
        List<Musictable> m1=musictableMapper.findByname(searchAll);
        List<Musictable> m2=musictableMapper.findBySinger(searchAll);
        List<Musictable> m3=new ArrayList<>();
        List<Musictable> m4=musictableMapper.findAll();
        m3.addAll(m1);
        m3.addAll(m2);
    if(m1!=null && m2!=null){
        return new ResponseEntity<>(m3,HttpStatus.OK);
    }else if (m1!=null && m2==null){
        return new ResponseEntity<>(m1,HttpStatus.OK);
    }else if (m1==null && m2!=null){
        return new ResponseEntity<>(m2,HttpStatus.OK);
    }else {
        return new ResponseEntity<>(m4, HttpStatus.OK);
    }
    }

}
