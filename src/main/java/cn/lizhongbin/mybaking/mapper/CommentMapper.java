package cn.lizhongbin.mybaking.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapper {
    void deleteCommentsByContentId(Long contentId);
}
