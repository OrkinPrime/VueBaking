package cn.lizhongbin.mybaking.controller;

import cn.lizhongbin.mybaking.mapper.UserMapper;
import cn.lizhongbin.mybaking.pojo.vo.UserVO;
import cn.lizhongbin.mybaking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//二合一注解：@RestController==@Controller+@ResponseBody
@RestController
//添加前缀加以区分
@RequestMapping("/v1/users")
public class UserController {
    //Spring默认提供单例模式，各个类只能实例化一次产生一个对象
    // 一般类若构造函数为私有，则Spring无法创建
    //实现单例模式的原理-->饿汉式：在本类中实例化后，对外开放对应的getter
    //              -->懒汉式：在对外开放的getter中对本类进行实例化，添加判断是否已有实例化，无则被调用时才实例化，有则不需要实例化，记得加同步锁synchronized

    //从类型出发，查找时遇到同类型会出错【推荐】
    @Autowired
    private UserService userService;
    /*    //从名称出发，需要标注注入目标的名称,不指定名称则以注入的类为名称【不推荐】
        @Resource()
        private UserMapper userMapper;*/

//默认解析成视图，即以页面形式进行返回
//添加注解@ResponseBody，返回的结果则变为正文，不再以页面形式返回
    @GetMapping("/info")
    public UserVO getUserInfo(String username) {
        return  userService.findUserinfoByUsername(username);
    }
}
