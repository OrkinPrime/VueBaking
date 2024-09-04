package cn.lizhongbin.mybaking.service;

import cn.lizhongbin.mybaking.pojo.dto.ContentDTO;
import cn.lizhongbin.mybaking.pojo.vo.ContentDetailVO;
import cn.lizhongbin.mybaking.pojo.vo.ContentIndexVO;
import cn.lizhongbin.mybaking.pojo.vo.ContentVO;
import cn.lizhongbin.mybaking.pojo.vo.OtherContentVO;

import java.util.List;

public interface ContentService {
    void addContent(ContentDTO contentDTO);

    List<ContentVO> findContentsByUserIdANDType(Long id, Long type);

    void removeContentById(Long contentId);

    ContentVO getContentById(Long id);

    List<ContentIndexVO> findContentIndexAll(Long type, Long categoryId);

    List<ContentIndexVO> findContentListByType(Long type);

    List<ContentIndexVO> findContentListByKeyword(String kw);

    ContentDetailVO findContentDetailById(Long id);

    List<OtherContentVO> findOtherContent(Long userId,Long id);

    List<OtherContentVO> findHotContent(Long id);
}
