package cn.lizhongbin.mybaking.controller;

import cn.lizhongbin.mybaking.pojo.vo.BannerVO;
import cn.lizhongbin.mybaking.response.JsonResult;
import cn.lizhongbin.mybaking.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/banner")
public class BannerController {
    @Autowired
    private BannerService bannerService;

    @GetMapping("all")
    public JsonResult getAllBanner(){
        List<BannerVO> list = bannerService.findAllBanner();
        return JsonResult.ok(list);
    }
}
