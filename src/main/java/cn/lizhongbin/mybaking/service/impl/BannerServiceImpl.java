package cn.lizhongbin.mybaking.service.impl;

import cn.lizhongbin.mybaking.exception.ServiceException;
import cn.lizhongbin.mybaking.mapper.BannerMapper;
import cn.lizhongbin.mybaking.pojo.vo.BannerVO;
import cn.lizhongbin.mybaking.response.ServiceCode;
import cn.lizhongbin.mybaking.service.BannerService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class BannerServiceImpl implements BannerService {

    private final BannerMapper bannerMapper;

    public BannerServiceImpl(BannerMapper bannerMapper) {
        this.bannerMapper = bannerMapper;
    }

    @Override
    public List<BannerVO> findAllBanner() {
        List<BannerVO> list = new ArrayList<>();
        list= bannerMapper.selectAllBanner();
        if (list==null){
            throw new ServiceException(ServiceCode.ERR_SELECT,"Banner获取失败");
        }
        return list;
    }
}
