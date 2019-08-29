package com.newer.mymusic.service;

import com.newer.mymusic.domain.Personage;
import com.newer.mymusic.mapper.PersonageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonageService {
    @Autowired
    private PersonageMapper personageMapper;

    public Personage getpersonage(String UserName, String Userpwd){
        return personageMapper.getpersonage(UserName,Userpwd);
    };

    public int addPersonage(Personage p){
     return  personageMapper.addPersonage(p);
    };


    public  Personage selectById(String UserName){
        return personageMapper.selectById(UserName);
    }


    public int updPersonage(Personage updPersonage){
        return personageMapper.updPersonage(updPersonage);
    }
}
