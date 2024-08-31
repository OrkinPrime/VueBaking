package cn.lizhongbin.mybaking.controller;

import cn.lizhongbin.mybaking.response.JsonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/v1/uploads")
public class UploadController {
    @PostMapping("file")
    public JsonResult upload(MultipartFile file) {//参数名与前端对应
        System.out.println(file.getOriginalFilename());
        return JsonResult.ok();
    }
}
