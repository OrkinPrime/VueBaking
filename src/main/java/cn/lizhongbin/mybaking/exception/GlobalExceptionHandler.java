package cn.lizhongbin.mybaking.exception;

import cn.lizhongbin.mybaking.response.JsonResult;
import cn.lizhongbin.mybaking.response.ServiceCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


//面向切面编程的思想
@RestControllerAdvice//监听所有Controller的异常
public class GlobalExceptionHandler {

    @ExceptionHandler(value = ServiceException.class)//监听某一个Controller的异常
    //不指定，则默认使用参数的类型
    public JsonResult handleServiceException(ServiceException e) {
        return JsonResult.fail(e);
    }

    @ExceptionHandler
    public JsonResult handleException(Exception e) {
        return JsonResult.fail(ServiceCode.ERR_UNKNOWN,"未知错误");
    }
}
