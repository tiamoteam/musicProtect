package com.newer.mymusic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


public class IntceptiorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(createInterceptor()).addPathPatterns("/**")//所有路径
                .excludePathPatterns("/login");//不会拦截的请求
    }

    @Bean
    public MyIntceptior createInterceptor(){
        return  new MyIntceptior();
    }
}
