package cn.lizhongbin.mybaking.service;

import cn.lizhongbin.mybaking.pojo.dto.UserLoginDTO;
import cn.lizhongbin.mybaking.pojo.dto.UserRegDTO;
import cn.lizhongbin.mybaking.pojo.vo.UserLoginVO;
import cn.lizhongbin.mybaking.pojo.vo.UserVO;
public interface UserService {
    UserVO getUserInfoByUsername(String username);

    UserLoginVO validateLogin(UserLoginDTO userLoginDTO);

    boolean createUserAccount(UserRegDTO user);
}
