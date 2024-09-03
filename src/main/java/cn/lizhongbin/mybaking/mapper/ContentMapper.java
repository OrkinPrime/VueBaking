package cn.lizhongbin.mybaking.mapper;

import cn.lizhongbin.mybaking.pojo.entity.Content;
import cn.lizhongbin.mybaking.pojo.vo.ContentVO;

import java.util.List;

public interface ContentMapper {
    Integer insertContent(Content content);

    List<ContentVO> selectContentsByCreatByAndType(Long id, Long type);

    Integer deleteContentsById(Long contentId);

    String selectImgUrlByContentId(Long contentId);

    String selectVideoUrlByContentId(Long contentId);

    ContentVO selectContentById(Long id);
}
