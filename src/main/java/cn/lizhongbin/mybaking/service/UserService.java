package cn.lizhongbin.mybaking.service;

import cn.lizhongbin.mybaking.pojo.vo.UserVO;
public interface UserService {
    UserVO findUserinfoByUsername(String username);
}
