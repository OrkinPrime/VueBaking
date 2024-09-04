package cn.lizhongbin.mybaking.controller;

import cn.lizhongbin.mybaking.pojo.dto.ContentDTO;
import cn.lizhongbin.mybaking.pojo.vo.ContentDetailVO;
import cn.lizhongbin.mybaking.pojo.vo.ContentIndexVO;
import cn.lizhongbin.mybaking.pojo.vo.ContentVO;
import cn.lizhongbin.mybaking.pojo.vo.OtherContentVO;
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
        //System.out.println(contentDTO);
        return JsonResult.ok();
    }

    @GetMapping("/{id}/{type}")
    public JsonResult getContents(@PathVariable Long id, @PathVariable Long type) {
        List<ContentVO> list = contentService.findContentsByUserIdANDType(id,type);
        return JsonResult.ok(list);
    }

    @PostMapping("/remove/{id}")
    public JsonResult removeContent(@PathVariable Long id) {
        contentService.removeContentById(id);
        return JsonResult.ok();
    }

    @GetMapping("/{id}/content")
    public JsonResult getContent(@PathVariable Long id) {
        ContentVO contentVO = contentService.getContentById(id);
        //System.out.println(contentVO);
        return JsonResult.ok(contentVO);
    }

    @GetMapping("/{type}/{categoryId}/index")
    public JsonResult getContentIndex(@PathVariable Long type, @PathVariable Long categoryId) {
        List<ContentIndexVO> list = contentService.findContentIndexAll(type,categoryId);
        return JsonResult.ok(list);
    }

    @GetMapping("/{type}/list")
    public JsonResult getContentList(@PathVariable Long type) {
        List<ContentIndexVO> list = contentService.findContentListByType(type);
        return JsonResult.ok(list);
    }
    @GetMapping("{kw}/search")
    public JsonResult searchContent(@PathVariable String kw) {
        List<ContentIndexVO> list = contentService.findContentListByKeyword(kw);
        return JsonResult.ok(list);
    }

    @GetMapping("{id}/detail")
    public JsonResult getContentDetail(@PathVariable Long id) {
        ContentDetailVO contentDetailVO = contentService.findContentDetailById(id);
        return JsonResult.ok(contentDetailVO);
    }

    @GetMapping("{userId}/{id}/otherC")
    public JsonResult getOtherContent(@PathVariable Long userId,@PathVariable Long id) {
        List<OtherContentVO> list = contentService.findOtherContent(userId,id);
        return JsonResult.ok(list);
    }
    @GetMapping("/{id}/hotC")
    public JsonResult getHotContent(@PathVariable Long id) {
        List<OtherContentVO> list = contentService.findHotContent(id);
        return JsonResult.ok(list);
    }
}
