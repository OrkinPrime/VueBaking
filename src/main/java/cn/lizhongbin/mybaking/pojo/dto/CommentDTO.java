package cn.lizhongbin.mybaking.pojo.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CommentDTO implements Serializable {
    private String content;
    private Long userId;
    private Long contentId;
}
