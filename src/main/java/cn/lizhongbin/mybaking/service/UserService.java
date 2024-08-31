package cn.lizhongbin.mybaking.service;

import cn.lizhongbin.mybaking.pojo.dto.UserLoginDTO;
import cn.lizhongbin.mybaking.pojo.vo.UserLoginVO;
import cn.lizhongbin.mybaking.pojo.vo.UserVO;
public interface UserService {
    UserVO findUserinfoByUsername(String username);

    UserLoginVO loginValidate(UserLoginDTO userLoginDTO);
}
