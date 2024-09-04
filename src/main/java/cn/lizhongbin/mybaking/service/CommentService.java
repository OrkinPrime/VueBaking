package cn.lizhongbin.mybaking.service;

import cn.lizhongbin.mybaking.pojo.dto.CommentDTO;
import cn.lizhongbin.mybaking.pojo.vo.CommentVO;

import java.util.List;

public interface CommentService {
    void addNew(CommentDTO commentDTO);

    List<CommentVO> findAllCommentsById(Integer contentId);
}
