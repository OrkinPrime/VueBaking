package cn.lizhongbin.mybaking.response;

import cn.lizhongbin.mybaking.exception.ServiceException;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;


@Data
@Accessors(chain = true)//可以对一个对象链式调用方法
/*
* 实现方式：
* public A a(D data){
*   this.data=data;
*   return this;
* }
* */

public class JsonResult<T> implements Serializable {

    private Integer code;
    private String msg;
    private T data;

    //静态方法->不受对象影响，可以直接调用
    //非静态方法->受对象影响
    public static <T> JsonResult<Void> ok() {
        return ok(null);
    }

    public static <T> JsonResult<T> ok(T data) {
        JsonResult<T> result = new JsonResult<>();
        result.setCode(ServiceCode.OK.getValue()).setMsg("ok").setData(data);
        return result;
    }

    public static JsonResult fail(ServiceException e) {
        JsonResult result = new JsonResult();
        result.setCode(e.getServiceCode().getValue()).setMsg(e.getMessage()).setData(null);
        return result;
    }

}
