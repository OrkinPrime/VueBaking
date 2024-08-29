package cn.lizhongbin.mybaking.pojo.vo;

import lombok.Data;

import java.io.Serializable;

//VO 用于响应返回给前端
//序列化：把对象打散成字节发送出去
//实现接口 Serializable 来标识此类需要序列化
@Data
//@Data自动添加Get、Set等
public class UserVO implements Serializable {
    private Long id;
    private String username;
    private String nickname;
    private String imgUrl;
    private Integer isAdmin;
}
