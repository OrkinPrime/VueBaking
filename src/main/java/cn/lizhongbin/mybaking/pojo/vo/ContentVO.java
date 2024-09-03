package cn.lizhongbin.mybaking.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;


//后端向前端
@Data
public class ContentVO implements Serializable {
    private Long id;
    private String title;
    private String imgUrl;
    //private String videoUrl;
    //private String content;
    private Long type;
    private Integer viewCount;
    private Integer commentCount;
    private String categoryName;
    //    private Long createBy;
    @JsonFormat(pattern = "yyyy/mm/dd",timezone = "GMT+8")
    private LocalDateTime createTime;
    //    private Long updateBy;
//    private LocalDateTime updateTime;
    private String brief;
//    private Long categoryId;
}
