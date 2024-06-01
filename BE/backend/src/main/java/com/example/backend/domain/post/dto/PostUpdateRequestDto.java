package com.example.backend.domain.post.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PostUpdateRequestDto {
    private Long id;
    private String title;
    private String owner;
    private String content;
    private Long password;
}
