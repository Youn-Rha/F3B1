package com.example.backend.domain.comment.entity;

import com.example.backend.domain.post.entity.Post;
import com.example.backend.global.BaseEntity;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Comment extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "post_id")
    private Post post;




    @Builder
    public Comment(String content, Post post) {
        this.content = content;
        this.post = post;
    }
}
