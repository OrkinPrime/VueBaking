package cn.lizhongbin.mybaking.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class ContentDetailVO implements Serializable {
    private Long id;
    private String title;
    private String content;
    private String brief;
    private String nickname;
    private String videoUrl;
    private String contentImageUrl;
    private Integer viewCount;
    private Integer commentCount;
    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss",timezone = "GMT+8")
    private LocalDateTime createTime;
    private String userImageUrl;
    private Long userId;
    private Long type;
}
