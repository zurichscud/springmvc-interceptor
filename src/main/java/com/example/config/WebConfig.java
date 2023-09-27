package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: zurichscud
 * @Date: 2023/9/24 18:21
 * @Description: TODO
 */
@Configuration
@ComponentScan("com.example.controller")
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    /**
     * @Description: 处理静态资源请求
     * @Param: 
     * @Return: 
     **/
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
