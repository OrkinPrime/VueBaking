package cn.lizhongbin.mybaking.pojo.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserLoginVO implements Serializable {
    private Long id;
    private String username;
    private String nickname;
    private String imgUrl;
    private Integer isAdmin;
}
