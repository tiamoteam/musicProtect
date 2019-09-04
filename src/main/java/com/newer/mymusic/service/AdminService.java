package com.newer.mymusic.service;

import com.newer.mymusic.domain.Admin;
import com.newer.mymusic.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminMapper  adminMapper;

    public Admin getAdmin(String aname,int pwd) {
        return adminMapper.getAdmin(aname, pwd);
    }

    public int updPwd(String aname,int pwd) {
        return adminMapper.updPwd(aname,pwd);
    }

    public int addAdmin(Admin a) {
        return adminMapper.addAdmin(a);
    }

    public  Admin selectById(String aname){
        return adminMapper.selectById(aname);
    }

    public List<Admin> selectAll(){ return adminMapper.selectAll(); }

    public int updEnableqy(int id){ return adminMapper.updEnableqy(id); }

    public int updEnablejy(int id){ return adminMapper.updEnableqy(id); }

    public int delById(int id){ return adminMapper.delById(id); }

}
