package com.newer.mymusic.service;

import com.newer.mymusic.domain.Post;
import com.newer.mymusic.mapper.PostMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService implements PostMapper {
    @Autowired
    private PostMapper postMapper;
    @Override
    public List<Post> selectAll() {
        return postMapper.selectAll();
    }

    @Override
    public List<Post> selectwAll() {
        return postMapper.selectwAll();
    }

    @Override
    public int delById(int Postid) {
        return postMapper.delById(Postid);
    }

    @Override
    public Post selectBypid(int postid) {
        return postMapper.selectBypid(postid);
    }

    @Override
    public int updatetg(int postid) {
        return postMapper.updatetg(postid);
    }

    @Override
    public int updatewtg(int postid) {
        return postMapper.updatewtg(postid);
    }
}
