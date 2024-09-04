package cn.lizhongbin.mybaking.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Comment implements Serializable {
    private Long id;
    private String content;
    private Long userId;
    private Long contentId;
    private LocalDateTime createTime;
}
