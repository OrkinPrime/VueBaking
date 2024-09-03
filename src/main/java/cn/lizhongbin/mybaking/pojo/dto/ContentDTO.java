package cn.lizhongbin.mybaking.pojo.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ContentDTO implements Serializable {
    private Long id;
    private String title;
    private String imgUrl;
    private String videoUrl;
    private String content;
    private Long type;
    private Long createBy;
    private String brief;
    private Long categoryId;
}
