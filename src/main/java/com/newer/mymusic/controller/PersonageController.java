package com.newer.mymusic.controller;

import com.newer.mymusic.domain.personage;
import com.newer.mymusic.service.PersonageService;
import com.newer.mymusic.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonageController {

    @Autowired
    private PersonageService personageService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam("UserName")String UserName, @RequestParam("Userpwd")String Userpwd){
        int msg = 0;
        personage a = personageService.getpersonage(UserName,Userpwd);

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
    public ResponseEntity<?> zhuce(personage p){
       int fluRows=0;
        System.out.println(p);
        if (p!=null){
            fluRows=personageService.addPersonage(p);
            return new ResponseEntity<>(fluRows,HttpStatus.OK);
        }
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
