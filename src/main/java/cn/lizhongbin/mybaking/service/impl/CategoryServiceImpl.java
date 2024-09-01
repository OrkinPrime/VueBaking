package cn.lizhongbin.mybaking.service.impl;


import cn.lizhongbin.mybaking.mapper.CategoryMapper;
import cn.lizhongbin.mybaking.pojo.vo.CategoryVO;
import cn.lizhongbin.mybaking.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<CategoryVO> fetchSecondLevelCategory(Integer type) {
       return categoryMapper.selectCategoryByType(type);
    }
}
