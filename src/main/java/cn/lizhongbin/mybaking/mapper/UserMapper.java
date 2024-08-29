package cn.lizhongbin.mybaking.mapper;

import cn.lizhongbin.mybaking.pojo.vo.UserVO;
public interface UserMapper {
    UserVO selectUserinfoByUsername (String username);
}
