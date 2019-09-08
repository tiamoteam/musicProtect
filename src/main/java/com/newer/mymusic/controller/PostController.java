package com.newer.mymusic.controller;

import com.newer.mymusic.domain.Post;
import com.newer.mymusic.service.PostService;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class PostController  {

    @Autowired
    private PostService ps;

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
}
