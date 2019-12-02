package com.dyz.until;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
*   拦截器
* */
public class Interceptor implements HandlerInterceptor {
    /*
    * 拦截器请求，Controller调用之前
    *
    * */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("自定义拦截器开始执行");
        //拦截用户token
        String tokens = request.getParameter("token");
        //获取session里面的token
        String token = (String)request.getSession().getAttribute("token");

        /*
        如果不是映射到方法直接通过
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
         HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        // 判断接口是否需要登录
        LoginRequired methodAnnotation = method.getAnnotation(LoginRequired.class);
        */
        //检查有没有需要用户权限的注解


        //判断token是否为空
        if (tokens == null){
            throw new CommonException(401,"请重新登录");
            //return false;
        }if (tokens==token){
            return true;
        }
        return false;
    }

    /*
     * 拦截器请求，Controller调用之后
     *
     * */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
