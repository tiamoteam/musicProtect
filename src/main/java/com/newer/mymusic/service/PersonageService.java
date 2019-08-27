package com.newer.mymusic.service;

import com.newer.mymusic.domain.personage;
import com.newer.mymusic.mapper.PersonageMapper;
import org.springframework.stereotype.Service;

@Service
public class PersonageService {
    private PersonageMapper personageMapper;

    public personage getpersonage(String UserName,String Userpwd){
        return personageMapper.getpersonage(UserName,Userpwd);
    };

    public int addPersonage(personage p){
     return  personageMapper.addPersonage(p);
    };


}
