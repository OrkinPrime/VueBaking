package cn.lizhongbin.mybaking.pojo.dto;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserUpdateDTO implements Serializable {
    private String username;
    private Integer isAdmin;
    private String nickname;
    private String password;
    private String imgUrl;

}
