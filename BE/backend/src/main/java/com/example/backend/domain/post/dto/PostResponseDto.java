package com.example.backend.domain.post.dto;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public class PostResponseDto {
    private Long postId;
    private String title;
    private String owner;
    private String content;
    private LocalDateTime updatedAt;
}
