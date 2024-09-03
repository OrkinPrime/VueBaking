package cn.lizhongbin.mybaking.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class Banner implements Serializable {
    private Long id;
    private String imgUrl;
    private Integer sort;
    private LocalDateTime createTime;
}
