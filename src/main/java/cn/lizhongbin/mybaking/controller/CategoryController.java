package cn.lizhongbin.mybaking.controller;


import cn.lizhongbin.mybaking.response.JsonResult;
import cn.lizhongbin.mybaking.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("{type}/sub")
    public JsonResult subListByType(@PathVariable("type") Integer type){
        return JsonResult.ok(categoryService.fetchSecondLevelCategory(type));
    }
}
