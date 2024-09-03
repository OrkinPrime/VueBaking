package cn.lizhongbin.mybaking.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Content implements Serializable {
    private Long id;
    private Long type;
    private Long updateBy;
    private Long categoryId;
    private Long createBy;
    private String title;
    private String imgUrl;
    private String videoUrl;
    private String content;
    private String brief;
    private Integer viewCount;
    private Integer commentCount;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
