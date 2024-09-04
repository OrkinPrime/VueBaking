package cn.lizhongbin.mybaking.mapper;

import cn.lizhongbin.mybaking.pojo.entity.Comment;
import cn.lizhongbin.mybaking.pojo.entity.Content;
import cn.lizhongbin.mybaking.pojo.vo.CommentVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    void deleteCommentsByContentId(Long contentId);

    Integer insertComment(Comment comment);

    List<CommentVO> selectAllCommentsByContentId(Integer contentId);
}
