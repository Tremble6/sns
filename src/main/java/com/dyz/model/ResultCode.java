package com.dyz.model;

/**
 * 状态码和msg
 *
 * @Author zhanglianwei
 * @Date 2019/10/17 20:45
 * @Version 1.0
 */
public enum ResultCode {
    /**
     * 1xx 信息：表明服务器已经收到Request， 但需要进一步处理，请客户端等待
     * 2xx 成功： 处理成功
     * 3xx 重定向请求的地址已被重定向，需要客户端重新发起请求
     * 4xx 客户端错误 ：请求中提交的参数或内容有误
     * 5xx 服务器错误：服务器处理请求出错，一般本类错误需要联系服务器管理员处理
     */

    HTTP200(200,"成功"),
    HTTP213456(213456,"无信息"),
    HTTP00034(00034,"E00034无法添加"),
    HTTP000345(000345,"E000345无法添加"),
    HTTP0003456(0003456,"E0003456无法添加"),
    HTTP12345(12345,"ngWord已存在");


    public int error_code;
    private String reason;

    ResultCode(int error_code, String reason) {
        this.error_code = error_code;
        this.reason = reason;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
