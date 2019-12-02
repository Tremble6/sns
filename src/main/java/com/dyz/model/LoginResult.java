package com.dyz.model;


import java.util.List;

/**
 * 登录响应类
 *
 * @Author zhanglianwei
 * @Date 2019/10/21 15:23
 * @Version 1.0
 */
public class LoginResult {
    public LoginResult(String token, List<?> obj) {
        this.token = token;
        this.obj = obj;
    }

    private String token;

    private List<?> obj;

    public void setToken(String token) {
        this.token = token;
    }

    public void setObj(List<?> obj) {
        this.obj = obj;
    }

    public String getToken() {
        return token;
    }

    public List<?> getObj() {
        return obj;
    }
}
