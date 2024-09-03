package cn.lizhongbin.mybaking.service;

import cn.lizhongbin.mybaking.pojo.dto.ContentDTO;
import cn.lizhongbin.mybaking.pojo.vo.ContentVO;

import java.util.List;

public interface ContentService {
    void addContent(ContentDTO contentDTO);

    List<ContentVO> findContentsByUserIdANDType(Long id, Long type);

    void removeContentById(Long contentId);

    ContentVO getContentById(Long id);
}
