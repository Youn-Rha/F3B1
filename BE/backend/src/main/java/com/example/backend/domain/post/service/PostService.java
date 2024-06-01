package com.example.backend.domain.post.service;

import com.example.backend.domain.post.dto.PostRequestDto;
import com.example.backend.domain.post.dto.PostResponseDto;
import com.example.backend.domain.post.dto.PostUpdateRequestDto;
import com.example.backend.domain.post.entity.Post;
import com.example.backend.domain.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public Post createPost(PostRequestDto postRequestDto){
        return postRepository.save(Post.toEntity(postRequestDto));
    }

    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    public PostResponseDto getPostById(Long id){
        Post post = postRepository.findById(id).orElse(null);
        if (post != null){
            return PostResponseDto.builder()
                    .postId(id)
                    .title(post.getTitle())
                    .owner(post.getOwner())
                    .content(post.getContent())
                    .updatedAt(post.getUpdatedAt())
                    .build();
        }
        else{
            return null;
        }
    }

    public void deletePost(Long id){
        postRepository.deleteById(id);
    }

    public Post updatePost(Long id, PostUpdateRequestDto postUpdateRequestDto){
        Post post = postRepository.findById(id).orElse(null);
        if (post != null){
            post.update(postUpdateRequestDto);
            return post;
        }
        else {
            return null;
        }
    }
}
