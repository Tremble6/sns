package com.dyz.until;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
* 注册拦截器
*
* */
@Configuration
public class WebAppConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加拦截器
        InterceptorRegistration registration = registry.addInterceptor(new Interceptor());
        //添加拦截路径
        registration.addPathPatterns("/sss/ss");
        //添加放行路径
        registration.excludePathPatterns("/*");
        registration.excludePathPatterns("/sns/*");
        registration.excludePathPatterns("/Manage/*");
        registration.excludePathPatterns("/sns/Manage/*");

    }
}
