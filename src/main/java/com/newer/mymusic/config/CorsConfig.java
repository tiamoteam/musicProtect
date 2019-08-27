package com.newer.mymusic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

//解决跨域
@Configuration
public class CorsConfig {

    private final String[] orings = {
            "127.0.0.1",
            "127.0.0.1:8084",
            "www.baidu.com",
    };

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        this.addAllowedOrigin(corsConfiguration);
        corsConfiguration.addAllowedMethod("*");//允许任意方式提交
        corsConfiguration.addAllowedHeader("*");//允许任意头部文件
        corsConfiguration.setAllowCredentials(true);//跨域时进行session共享


        UrlBasedCorsConfigurationSource source=new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**",corsConfiguration);
        return new CorsFilter(source);
    }


    private void addAllowedOrigin( CorsConfiguration corsConfiguration){
        for(String origin:orings){
            corsConfiguration.addAllowedOrigin("http://"+origin);
            corsConfiguration.addAllowedOrigin("https://"+origin);
        }
    }

}
