package com.example.backend.domain.post.entity;

import com.example.backend.domain.comment.entity.Comment;
import com.example.backend.global.BaseEntity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

public class Post extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String name;
    private String content;
    private Long password;

    @OneToMany(mappedBy = "post")
    private List<Comment> commentList;


}
