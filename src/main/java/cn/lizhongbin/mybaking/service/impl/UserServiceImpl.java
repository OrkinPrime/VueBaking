package cn.lizhongbin.mybaking.service.impl;

import cn.lizhongbin.mybaking.exception.ServiceException;
import cn.lizhongbin.mybaking.mapper.UserMapper;
import cn.lizhongbin.mybaking.pojo.dto.UserLoginDTO;
import cn.lizhongbin.mybaking.pojo.vo.UserLoginVO;
import cn.lizhongbin.mybaking.pojo.vo.UserVO;
import cn.lizhongbin.mybaking.response.ServiceCode;
import cn.lizhongbin.mybaking.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    //Spring默认提供单例模式，各个类只能实例化一次产生一个对象
    // 一般类若构造函数为私有，则Spring无法创建
    //实现单例模式的原理-->饿汉式：在本类中实例化后，对外开放对应的getter
    //              -->懒汉式：在对外开放的getter中对本类进行实例化，添加判断是否已有实例化，无则被调用时才实例化，有则不需要实例化，记得加同步锁synchronized

    //从类型出发，查找时遇到同类型会出错【推荐】
    @Autowired
    private UserMapper userMapper;

    /*    //从名称出发，需要标注注入目标的名称,不指定名称则以注入的类为名称【不推荐】
        @Resource()
        private UserMapper userMapper;*/
    @Override
//    重写要求：两同两小一大
    public UserVO findUserinfoByUsername(String username) {
        UserVO userVO = userMapper.selectUserinfoByUsername(username);
        if (userVO == null) {
            throw new ServiceException(ServiceCode.ERR_SELECT,"用户不存在");
        }
        return userVO;
    }

    @Override
    public UserLoginVO loginValidate(UserLoginDTO userLoginDTO) {
        UserVO userVO = userMapper.selectUserinfoByUsername(userLoginDTO.getUsername());
        if (userVO == null) {
            throw new ServiceException(ServiceCode.ERR_SELECT,"用户不存在");
        }
        if (!userLoginDTO.getPassword().equals(userVO.getPassword())) {
            throw new ServiceException(ServiceCode.ERR_SELECT,"用户名或密码错误");
        }
        UserLoginVO userLoginVO = new UserLoginVO();
        //将前者属性copy到后者
        BeanUtils.copyProperties(userVO, userLoginVO);
        return userLoginVO;
    }
}
