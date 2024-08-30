package cn.lizhongbin.mybaking.exception;

import cn.lizhongbin.mybaking.response.ServiceCode;

public class ServiceException extends RuntimeException {
    private ServiceCode serviceCode;
    public ServiceException(ServiceCode serviceCode,String msg) {
        super(msg);//获取异常的消息
        this.serviceCode = serviceCode;//设置自定义异常处理的code
    }

    public ServiceCode getServiceCode() {
        return serviceCode;
    }
}
