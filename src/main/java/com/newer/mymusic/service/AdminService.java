package com.newer.mymusic.service;

import com.newer.mymusic.domain.Admin;
import com.newer.mymusic.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminMapper  adminMapper;

    public Admin getAdmin(String aname,String pwd) {
        return adminMapper.getAdmin(aname, pwd);
    }

    public int updPwd(Admin a) {
        return adminMapper.updPwd(a);
    }

    public int addAdmin(Admin a) {
        return adminMapper.addAdmin(a);
    }

    public  Admin selectById(String aname){
        return adminMapper.selectById(aname);
    }

}
