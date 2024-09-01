package cn.lizhongbin.mybaking.service;

import cn.lizhongbin.mybaking.pojo.vo.CategoryVO;

import java.util.List;

public interface CategoryService {
    List<CategoryVO> fetchSecondLevelCategory(Integer type);
}
