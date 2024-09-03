package cn.lizhongbin.mybaking.controller;

import cn.lizhongbin.mybaking.pojo.dto.ContentDTO;
import cn.lizhongbin.mybaking.pojo.vo.ContentVO;
import cn.lizhongbin.mybaking.response.JsonResult;
import cn.lizhongbin.mybaking.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/contents")
public class ContentController {
    @Autowired
    ContentService contentService;

    @PostMapping("/add-new")
    public JsonResult addNewContent(ContentDTO contentDTO) {
        contentService.addContent(contentDTO);
        System.out.println(contentDTO);
        return JsonResult.ok();
    }

    @GetMapping("/{id}/{type}")
    public JsonResult getContents(@PathVariable Long id, @PathVariable Long type) {
        List<ContentVO> list = contentService.findContentsByUserIdANDType(id,type);
        System.out.println(list);
        return JsonResult.ok(list);
    }

    @PostMapping("/remove/{id}")
    public JsonResult removeContent(@PathVariable Long id) {
        contentService.removeContentById(id);
        return JsonResult.ok();
    }
}
