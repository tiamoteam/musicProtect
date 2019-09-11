package com.newer.mymusic.controller;

import com.newer.mymusic.domain.Post;
import com.newer.mymusic.service.PostService;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class PostController  {

    @Autowired
    private PostService ps;

    //查询所有审批通过了的博客信息
    @GetMapping("selectps")
    public ResponseEntity<?> selectAll(){
        HashMap<String, List<Post>> map = new HashMap<>();
        List<Post> postList = ps.selectAll();
        if(postList!=null){
            map.put("data",postList);
            return new ResponseEntity<>(map, HttpStatus.OK);
        }
        return new ResponseEntity<>(2,HttpStatus.OK);
    }

    //查询所有审批未通过的博客信息
    @GetMapping("selectWps")
    public ResponseEntity<?> selectWAll(){
        HashMap<String, List<Post>> map = new HashMap<>();
        List<Post> postList = ps.selectwAll();
        if(postList!=null){
            map.put("data",postList);
            return new ResponseEntity<>(map, HttpStatus.OK);
        }
        return new ResponseEntity<>(3,HttpStatus.OK);
    }
    //根据id删除一条博客信息
    @Delete("delByps")
    public ResponseEntity<?> delpost(@Param("Postid") int Postid){
        if(Postid!=0){
            int a = ps.delById(Postid);
            if(a!=0){
                return new ResponseEntity<>(a,HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(2,HttpStatus.OK);
    }

    //根据博客id查询对应的博客内容和图片
    @GetMapping("/selBypid")
    public ResponseEntity<?> selectBypid(int postid){
            Post post = ps.selectBypid(postid);
            if(post!=null){
                return new ResponseEntity<>(post,HttpStatus.OK);
            }
            return new ResponseEntity<>(1,HttpStatus.OK);
    }

    //审核通过的博客
    @PostMapping("/updtg")
    public ResponseEntity<?> updatetg(int postid){
        int a = ps.updatetg(postid);
        return new ResponseEntity<>(a,HttpStatus.OK);
    }

    //审核不合格的博客
    @PostMapping("/updwtg")
    public ResponseEntity<?> updatewtg(int postid){
        int a = ps.updatewtg(postid);
        return new ResponseEntity<>(a,HttpStatus.OK);
    }



}
