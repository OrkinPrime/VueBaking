package cn.lizhongbin.mybaking.controller;

import cn.lizhongbin.mybaking.exception.ServiceException;
import cn.lizhongbin.mybaking.mapper.UserMapper;
import cn.lizhongbin.mybaking.pojo.dto.UserUpdateDTO;
import cn.lizhongbin.mybaking.response.JsonResult;
import cn.lizhongbin.mybaking.response.ServiceCode;
import cn.lizhongbin.mybaking.service.UserService;
import cn.lizhongbin.mybaking.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping("/v1/uploads")
public class UploadController {

    @Autowired
    private UserService userService;

    //使用Spring的注解，在类中使用配置文件application.yml中的值
    @Value("${local.address}")
    private String fileUrl; //文件url基础路径

    @PostMapping("file/remove")
    public JsonResult removeFile(String url, UserUpdateDTO userUpdateDTO) {//前端传来url
        //拼接形成对后端的url
        new File(fileUrl+url).delete();
        if(userUpdateDTO.getUsername()!=null)
            userService.removeImgByUsername(userUpdateDTO);
        return JsonResult.ok();
    }

    @PostMapping("file")
    public JsonResult upload(MultipartFile file) throws IOException {                          //传入参数名与前端对应

        //从前端上传的原文件名入手
        String filename = file.getOriginalFilename();
        //截取类型名
        String lastName = filename.substring(filename.lastIndexOf("."));    //substring字符串截取（传入截取位置），lastIndexOf（获取位置）一个参数，自参数向后截取；两个参数，含头不含尾
        //生成文件名
        filename = UUID.randomUUID() + lastName;                                //UUID.randomUUID生成随机不重复的名字

        //生成文件日期分类路径
        Format simpleDateFormat = new SimpleDateFormat("/yyyy/MM/dd/");
        String dateUrl = simpleDateFormat.format(new Date());

        //拼接最终文件路径
        String allUrl = fileUrl + dateUrl;

        //判断此文件是否已经存在
        File file1 = new File(allUrl);
        if (!file1.exists()) {
            file1.mkdirs();             //创建文件路径
        }

        //把上传的文件注入到上面准备好的文件
        file.transferTo(new File(allUrl+filename));             //需抛错

        //返回部分路径，以便前端访问
        return JsonResult.ok(dateUrl+filename);
    }
}
