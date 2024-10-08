package cn.lizhongbin.mybaking.mapper;

import cn.lizhongbin.mybaking.pojo.dto.UserUpdateDTO;
import cn.lizhongbin.mybaking.pojo.entity.User;
import cn.lizhongbin.mybaking.pojo.vo.UserVO;
public interface UserMapper {
    UserVO selectUserinfoByUsername (String username);

    Integer insertUser(User user);

    Integer updateUser(UserUpdateDTO userUpdateDTO);

    Integer removeImgByUsername(UserUpdateDTO userUpdateDTO);
}
