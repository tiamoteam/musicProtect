package com.newer.mymusic.controller;

import com.newer.mymusic.domain.Admin;
import com.newer.mymusic.service.AdminService;
import com.newer.mymusic.util.JwtTokenUtil;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Value("${auth.header}") //去application.yml 获取auth.header的值
    private String header;

    @PostMapping("/login1")
    public ResponseEntity<?> login(@RequestParam("aname")String aname, @RequestParam("password")int pwd){
        int msg = 0;
        Admin a = adminService.getAdmin(aname,pwd);
 if(a.getEnable().equals("已启用")) {
    if (a != null) {
        String token = jwtTokenUtil.createJwt(aname);
        System.out.println(token);
        return new ResponseEntity<>(token, HttpStatus.OK);
    } else {
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }
         }else{
          msg=1;
     return new ResponseEntity<>(msg, HttpStatus.OK);
         }
    }

    @PostMapping("/addAdmin")
    public ResponseEntity<?> addAdmin(Admin a){
       int flous=0;
        Admin a1;
       if ((a1=adminService.selectById(a.getAname()))!=null){
           flous=2;//判断用户名是否被注册
           return new ResponseEntity<>(flous,HttpStatus.OK);
       }else if (a!=null){
           //添加成功
           flous=adminService.addAdmin(a);
            return new ResponseEntity<>(flous,HttpStatus.OK);
        }else {
           //账号或密码为空！
            return new ResponseEntity<>(flous,HttpStatus.OK);
       }
    }


    @RequestMapping("/updpwd")
    public ResponseEntity<?> updpwd(@RequestParam("aname")String aname, @RequestParam("pwd")String pwd
            , @RequestParam("pwd1")String pwd1, @RequestParam("pwd2")String pwd2) {
        int msg;
        Admin a = adminService.selectById(aname);
        if (Integer.parseInt(pwd)==(a.getPwd())) {

            if (pwd2.equals(pwd1)) {
                msg=1;
                msg = adminService.updPwd(aname, Integer.parseInt(pwd1));
                return new ResponseEntity<>(msg, HttpStatus.OK);
            }else {
                msg=2;
                return new ResponseEntity<>(msg, HttpStatus.OK);
            }
        }else {
            msg=0;
            return new ResponseEntity<>(msg, HttpStatus.OK);
        }

    }

    @RequestMapping("/check1")
    public ResponseEntity<?> check(HttpServletRequest request){
        String token = request.getHeader(header);
        if(token!=null){
            Claims claims = jwtTokenUtil.parseJWT(token);
            System.out.println(token);
            Admin a = adminService.selectById(claims.getIssuer());
            return new ResponseEntity<>(a,HttpStatus.OK);
        }else{
            return new ResponseEntity<>("fail",HttpStatus.OK);
        }
    }

}
