package cn.lizhongbin.mybaking.pojo.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class ContentIndexVO implements Serializable {
    private Long id;
    private String title;
    private String contentImgUrl;
    private String nickname;
    private String userImgUrl;
    private String categoryName;
}
