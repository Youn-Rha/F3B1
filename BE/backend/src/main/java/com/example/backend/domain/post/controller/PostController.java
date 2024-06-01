package com.example.backend.domain.post.controller;

import com.example.backend.domain.post.dto.PostRequestDto;
import com.example.backend.domain.post.dto.PostResponseDto;
import com.example.backend.domain.post.dto.PostUpdateRequestDto;
import com.example.backend.domain.post.entity.Post;
import com.example.backend.domain.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/posts")
public class PostController {
    private final PostService postService;

    // 게시글 생성
    @PostMapping
    public Post createPost(@RequestBody PostRequestDto postRequestDto){
        return postService.createPost(postRequestDto);
    }

    // 모든 게시글 조회
    @GetMapping
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }

    // 특정 게시글 조회
    @GetMapping("/{id}")
    public PostResponseDto getPostById(@PathVariable("id") Long id){
        return postService.getPostById(id);
    }

    // 특정 게시글 삭제
    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable("id") Long id){
        postService.deletePost(id);
    }

    // 게시글 수정 {post_id}/{user_id}
    @PutMapping("/{id}")
    public Post updatePost(@PathVariable("id") Long id, @RequestBody PostUpdateRequestDto postUpdateRequestDto){
        return postService.updatePost(id, postUpdateRequestDto);
    }
}
