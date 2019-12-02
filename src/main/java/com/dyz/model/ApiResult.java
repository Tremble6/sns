package com.dyz.model;

/**
 * 统一响应类，重写了set方法
 *
 * @Author zhanglianwei
 * @Date 2019/10/21 15:02
 * @Version 1.0
 */
public class ApiResult {
    /**
     * 状态码
     */
    private int error_code;
    /**
     * 状态信息
     */
    private String reason;
    /**
     * Token
     */
    private String token;
    /**
     *
     *  返回的数据
     */
    private Object data;

    /**
     * 重写构造器
     */
    public ApiResult() {
        // 初始化时给默认值
        this.error_code = ResultCode.HTTP200.getError_code();
        this.reason = ResultCode.HTTP200.getReason();
    }

    /**
     * 初始化一个ApiResult类，静态的
     *
     * @return
     */
    public static ApiResult build() {
        return new ApiResult();
    }

    /**
     * 返回状态码和信息
     */
    public ApiResult setCodeAndMessage(int error_code, String reason) {
        this.error_code = error_code;
        this.reason = reason;
        return this;
    }


    public int getCode() {
        return error_code;
    }

    public ApiResult setCode(int error_code) {
        this.error_code = error_code;
        return this;
    }

    public String getMessage() {
        return reason;
    }

    public ApiResult setMessage(String reason) {
        this.reason = reason;
        return this;
    }

    public String getToken() {
        return token;
    }

    public ApiResult setToken(String token) {
        this.token = token;
        return this;
    }

    public Object getData() {
        return data;
    }

    public ApiResult setData(Object data) {
        this.data = data;
        return this;
    }


}
