package com.hao.sharefile.common.bean;

/**
 * @author mkdirHao
 * @version 1.0
 * @date 2020/11/9 15:22
 */
public class ResultBean {
    private String msg;
    private int code;
    private Object data;

    //错误
    public static final ResultBean argError = fail("参数异常");
    public static final ResultBean serverError = fail(ResultCode.serverError,"服务器开小差了");

    public ResultBean() {

    }

    public ResultBean(String msg, int code, Object data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public static ResultBean Success(Object data){
        return new ResultBean("",ResultCode.ok,data);
    }

    public static ResultBean fail(String errorMsg){
        return new ResultBean(errorMsg,ResultCode.fail,null);
    }
    public static ResultBean fail(int resultCode,String errorMsg){
        return new ResultBean(errorMsg,ResultCode.fail,null);
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }

    public Object getData() {
        return data;
    }

    @Override
    public String toString() {
        return "ResultBean{" +
                "msg='" + msg + '\'' +
                ", code=" + code +
                ", data=" + data +
                '}';
    }
}
