package cn.lizhongbin.mybaking.mapper;

import cn.lizhongbin.mybaking.pojo.vo.CategoryVO;

import java.util.List;

public interface CategoryMapper {
   List<CategoryVO> selectCategoryByType(Integer type);
}
