package com.example.backend.domain.comment.service;

import com.example.backend.domain.comment.dto.CommentDeleteRequestDto;
import com.example.backend.domain.comment.dto.CommentRequestDto;
import com.example.backend.domain.comment.entity.Comment;
import com.example.backend.domain.comment.repository.CommentRepository;
import com.example.backend.domain.post.entity.Post;
import com.example.backend.domain.post.repository.PostRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
    private final PostRepository postRepository;


    public Comment createComment(Long id, CommentRequestDto commentRequestDto){
        Post post = postRepository.findById(id).orElse(null);
        if (post != null){
            return commentRepository.save(Comment.toEntity(post, commentRequestDto));
        }
        else {
            return null;
        }
    }

    public void deleteComment(CommentDeleteRequestDto commentDeleteRequestDto){
        commentRepository.deleteById(commentDeleteRequestDto.getId());
    }
}
