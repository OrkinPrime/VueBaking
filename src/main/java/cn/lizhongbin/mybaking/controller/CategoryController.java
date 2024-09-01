package cn.lizhongbin.mybaking.controller;


import cn.lizhongbin.mybaking.response.JsonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/categories")
public class CategoryController {
    @GetMapping("{type}/sub")
    public JsonResult subListByType(@PathVariable("type") Integer type){
        return JsonResult.ok();
    }
}
