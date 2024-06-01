package com.example.backend.domain.comment.controller;

import com.example.backend.domain.comment.dto.CommentDeleteRequestDto;
import com.example.backend.domain.comment.dto.CommentRequestDto;
import com.example.backend.domain.comment.entity.Comment;
import com.example.backend.domain.comment.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/{post_id}")
public class CommentController {
    private final CommentService commentService;
    // 댓글이 달림 (게시글에)
    @PostMapping
    public Comment createComment(@PathVariable("post_id") Long id, @RequestBody CommentRequestDto commentRequestDto){
        return commentService.createComment(id, commentRequestDto);
    }

    // 댓글 지우기
    public void deleteComment(@PathVariable("post_id") Long id, @RequestBody CommentDeleteRequestDto commentDeleteRequestDto){
        commentService.deleteComment(commentDeleteRequestDto);
    }
    // 댓글 수정하기 <- 필요 없을듯?

    // 댓글 보기 -> Post 조회에서 보기 가능
}
