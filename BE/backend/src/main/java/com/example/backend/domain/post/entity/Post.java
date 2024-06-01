package com.example.backend.domain.post.entity;

import com.example.backend.domain.comment.entity.Comment;
import com.example.backend.domain.post.dto.PostRequestDto;
import com.example.backend.domain.post.dto.PostUpdateRequestDto;
import com.example.backend.global.BaseEntity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@Getter
public class Post extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String owner;
    private String content;
    private Long password;

    @OneToMany(mappedBy = "post")
    private List<Comment> commentList;

    public void update(PostUpdateRequestDto postUpdateRequestDto){
        this.title = postUpdateRequestDto.getTitle();
        this.owner = postUpdateRequestDto.getOwner();
        this.content = postUpdateRequestDto.getContent();
        this.password = postUpdateRequestDto.getPassword();
    }

    public static Post toEntity(PostRequestDto postRequestDto){
        return Post.builder()
                .title(postRequestDto.getTitle())
                .owner(postRequestDto.getOwner())
                .content(postRequestDto.getContent())
                .password(postRequestDto.getPassword())
                .build();
    }

    @Builder
    public Post(String title, String owner, String content, Long password, List<Comment> commentList) {
        this.title = title;
        this.owner = owner;
        this.content = content;
        this.password = password;
        this.commentList = commentList;
    }
}
