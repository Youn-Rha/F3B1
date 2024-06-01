package com.example.backend.domain.comment.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class CommentDeleteRequestDto {
    private Long id;
}
