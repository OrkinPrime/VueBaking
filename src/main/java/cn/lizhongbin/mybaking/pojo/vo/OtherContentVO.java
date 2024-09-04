package cn.lizhongbin.mybaking.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class OtherContentVO implements Serializable {
    private Long id;
    private String title;
    private String imgUrl;
    private Integer viewCount;
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createTime;
}
