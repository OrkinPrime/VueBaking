package cn.lizhongbin.mybaking.service.impl;

import cn.lizhongbin.mybaking.exception.ServiceException;
import cn.lizhongbin.mybaking.mapper.CommentMapper;
import cn.lizhongbin.mybaking.pojo.dto.CommentDTO;
import cn.lizhongbin.mybaking.pojo.entity.Comment;
import cn.lizhongbin.mybaking.pojo.vo.CommentVO;
import cn.lizhongbin.mybaking.response.ServiceCode;
import cn.lizhongbin.mybaking.service.CommentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;

    @Override
    public void addNew(CommentDTO commentDTO) {
        Comment comment = new Comment();
        BeanUtils.copyProperties(commentDTO, comment);
        comment.setCreateTime(LocalDateTime.now());
        Integer result = commentMapper.insertComment(comment);
        if (result != 1) {
            throw new ServiceException(ServiceCode.ERR_INSERT,"评论失败！");
        }
    }

    @Override
    public List<CommentVO> findAllCommentsById(Integer contentId) {
        return commentMapper.selectAllCommentsByContentId(contentId);
    }
}
