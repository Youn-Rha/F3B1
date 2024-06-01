package com.example.backend.domain.post.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostDto {
    private Long id;
    private String title;
    private String name;
    private String content;
    private Long password;
}