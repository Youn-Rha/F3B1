package com.example.backend.domain.comment.entity;

import com.example.backend.domain.comment.dto.CommentRequestDto;
import com.example.backend.domain.post.entity.Post;
import com.example.backend.global.BaseEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Comment extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;


    public static Comment toEntity(Post existPost, CommentRequestDto commentRequestDto){
        return Comment.builder()
                .content(commentRequestDto.getContent())
                .post(existPost)
                .build();
    }
    @Builder
    public Comment(String content, Post post) {
        this.content = content;
        this.post = post;
    }
}
