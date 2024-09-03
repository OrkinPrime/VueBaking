package cn.lizhongbin.mybaking.mapper;

import cn.lizhongbin.mybaking.pojo.entity.Content;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapper {
    void deleteCommentsByContentId(Long contentId);

    Integer updateContent(Content content);
}
