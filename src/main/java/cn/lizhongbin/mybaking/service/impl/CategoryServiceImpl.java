package cn.lizhongbin.mybaking.service.impl;


import cn.lizhongbin.mybaking.exception.ServiceException;
import cn.lizhongbin.mybaking.mapper.CategoryMapper;
import cn.lizhongbin.mybaking.pojo.vo.CategoryVO;
import cn.lizhongbin.mybaking.response.ServiceCode;
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
        List<CategoryVO> categoryVOList =categoryMapper.selectCategoryByType(type);
        if (!(categoryVOList.size()>0)){
            throw new ServiceException(ServiceCode.ERR_SELECT,"二级列表获取失败");
        }
        return categoryVOList;
    }
}
