package cn.lizhongbin.mybaking.pojo.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class User implements Serializable {
    private Long id;
    private String username;
    private String nickname;
    private String password;
    private Integer isAdmin;
    private LocalDateTime createTime;//显示年月日时分秒
    private String imgUrl;

}
