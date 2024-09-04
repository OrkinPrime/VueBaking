package cn.lizhongbin.mybaking.mapper;

import cn.lizhongbin.mybaking.pojo.entity.Content;
import cn.lizhongbin.mybaking.pojo.vo.ContentDetailVO;
import cn.lizhongbin.mybaking.pojo.vo.ContentIndexVO;
import cn.lizhongbin.mybaking.pojo.vo.ContentVO;
import cn.lizhongbin.mybaking.pojo.vo.OtherContentVO;

import java.util.List;

public interface ContentMapper {
    Integer insertContent(Content content);

    List<ContentVO> selectContentsByCreatByAndType(Long id, Long type);

    Integer deleteContentsById(Long contentId);

    String selectImgUrlByContentId(Long contentId);

    String selectVideoUrlByContentId(Long contentId);

    ContentVO selectContentById(Long id);

    List<ContentIndexVO> selectForIndex(Long type, Long categoryId);

    Integer updateContent(Content content);

    List<ContentIndexVO> selectContentsByType(Long type);

    List<ContentIndexVO> selectContentsByKeyword(String kw);

    ContentDetailVO selectContentDetailById(Long id);

    void updateViewCount(int viewCount,Long id);

    List<OtherContentVO> selectOtherContentById(Long userId,Long id);

    List<OtherContentVO> selectHotContentById( Long id);
}
