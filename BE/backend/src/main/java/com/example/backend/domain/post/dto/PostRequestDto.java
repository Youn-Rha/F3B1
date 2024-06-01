package com.example.backend.domain.post.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class PostRequestDto {
    private String title;
    private String owner;
    private String content;
    private Long password;
}
