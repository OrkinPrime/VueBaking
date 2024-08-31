package cn.lizhongbin.mybaking.pojo.dto;
import lombok.Data;

import java.io.Serializable;
@Data
//DTO:前向后端数据交换
public class UserRegDTO implements Serializable {
    private String username;
    private String password;
    private String nickname;
}