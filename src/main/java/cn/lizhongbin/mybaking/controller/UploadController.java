package cn.lizhongbin.mybaking.controller;

import cn.lizhongbin.mybaking.exception.ServiceException;

import cn.lizhongbin.mybaking.pojo.dto.UserUpdateDTO;
import cn.lizhongbin.mybaking.response.JsonResult;
import cn.lizhongbin.mybaking.response.ServiceCode;
import cn.lizhongbin.mybaking.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@RestController
@RequestMapping("/v1/uploads")
public class UploadController {

    @Autowired
    private UserService userService;

    // [修改1] 添加对图片和视频存储路径的配置
    @Value("${local.address.images}")
    private String imageUploadPath;

    @Value("${local.address.videos}")
    private String videoUploadPath;

    @PostMapping("file/remove")
    public JsonResult removeFile(String url, UserUpdateDTO userUpdateDTO) {
        // [修改2] 处理 URL，确保从根目录开始
        String fullPath = url.startsWith("/") ? url.substring(1) : url;
        new File(imageUploadPath + fullPath).delete();
        if (userUpdateDTO.getUsername() != null) {
            userService.removeImgByUsername(userUpdateDTO);
        }
        return JsonResult.ok();
    }

    @PostMapping("file")
    public JsonResult upload(MultipartFile file) {
        // [修改3] 获取文件扩展名
        String extension = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".") + 1);

        // [修改4] 根据文件扩展名选择存储路径
        String uploadPath = "mp4".equals(extension) ? videoUploadPath : imageUploadPath;

        String filename = UUID.randomUUID() + "." + extension;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("/yyyy/MM/dd/");
        String dateUrl = LocalDate.now().format(formatter);

        String allUrl = uploadPath + dateUrl;

        File directory = new File(allUrl);
        if (!directory.exists()) {
            directory.mkdirs();
        }

        try {
            // [修改5] 上传文件，并捕获异常
            file.transferTo(new File(allUrl + filename));
        } catch (IOException e) {
            throw new ServiceException(ServiceCode.UPLOAD_FAILED, "文件上传失败");
        }

        // [修改6] 返回完整的访问路径

        System.out.println(dateUrl + filename);

        return JsonResult.ok(dateUrl + filename);
    }
}