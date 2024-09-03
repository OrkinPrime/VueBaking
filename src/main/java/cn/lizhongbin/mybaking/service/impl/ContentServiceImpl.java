package cn.lizhongbin.mybaking.service.impl;

import cn.lizhongbin.mybaking.exception.ServiceException;
import cn.lizhongbin.mybaking.mapper.CommentMapper;
import cn.lizhongbin.mybaking.mapper.ContentMapper;
import cn.lizhongbin.mybaking.pojo.dto.ContentDTO;
import cn.lizhongbin.mybaking.pojo.vo.ContentVO;
import cn.lizhongbin.mybaking.pojo.entity.Content;
import cn.lizhongbin.mybaking.response.ServiceCode;
import cn.lizhongbin.mybaking.service.ContentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ContentServiceImpl implements ContentService {

    @Autowired
    private ContentMapper contentMapper;

    @Autowired
    private CommentMapper commentMapper;

    @Value("D:/web/Vue/Java/myBaking/op")
    private String fileUrl; //文件url基础路径


    @Override
    public void addContent(ContentDTO contentDTO) {
        Integer result;
        Content content = new Content();
        BeanUtils.copyProperties(contentDTO, content);
        if (contentDTO.getId() == null) {
            content.setCreateTime(LocalDateTime.now());
            content.setCommentCount(0);
            content.setViewCount(0);
            result = contentMapper.insertContent(content);
            if (result != 1) {
                throw new ServiceException(ServiceCode.ERR_INSERT, "内容发布失败");
            }
        } else {
            content.setUpdateTime(LocalDateTime.now());
            content.setUpdateBy(contentDTO.getCreateBy());
           result= commentMapper.updateContent(content);
            if (result != 1) {
                throw new ServiceException(ServiceCode.ERR_INSERT, "内容修改失败");
            }

        }


    }

    @Override
    public List<ContentVO> findContentsByUserIdANDType(Long id, Long type) {
        List<ContentVO> list = contentMapper.selectContentsByCreatByAndType(id, type);
        if (list == null || list.size() == 0) {
            throw new ServiceException(ServiceCode.ERR_SELECT, "未发布数据！");
        }
        return list;
    }

    @Override
    @Transactional          //自动开启事务，把此方法体内的流程当做一个完整的事务，整体执行或者回滚
    public void removeContentById(Long contentId) {
        commentMapper.deleteCommentsByContentId(contentId); //删除相关评论
        //删除对应的img文件
        String imgUrl = contentMapper.selectImgUrlByContentId(contentId);
        if (imgUrl != null) {
            new File(fileUrl + "/images" + imgUrl).delete();
        }
        //删除对应的video文件
        String videoUrl = contentMapper.selectVideoUrlByContentId(contentId);
        if (videoUrl != null) {
            new File(fileUrl + "/videos" + videoUrl).delete();
        }
        //删除内容
        if (contentMapper.deleteContentsById(contentId) != 1) {
            throw new ServiceException(ServiceCode.ERR_DELETE, "删除失败！");
        }
    }

    @Override
    public ContentVO getContentById(Long id) {
        ContentVO contentVO = contentMapper.selectContentById(id);
        if (contentVO == null)
            throw new ServiceException(ServiceCode.ERR_SELECT, "内容获取失败！");
        return contentVO;
    }
}
