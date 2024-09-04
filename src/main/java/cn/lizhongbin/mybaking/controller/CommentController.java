package cn.lizhongbin.mybaking.controller;


import cn.lizhongbin.mybaking.pojo.dto.CommentDTO;
import cn.lizhongbin.mybaking.pojo.vo.CommentVO;
import cn.lizhongbin.mybaking.response.JsonResult;
import cn.lizhongbin.mybaking.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/comments")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping("add-new")
    public JsonResult addNewComment(CommentDTO commentDTO) {
        commentService.addNew(commentDTO);
        return JsonResult.ok();
    }

    @GetMapping("{contentId}/all")
    public JsonResult getAllComments(@PathVariable Integer contentId) {
        List<CommentVO> list = commentService.findAllCommentsById(contentId);
        return JsonResult.ok(list);
    }
}
