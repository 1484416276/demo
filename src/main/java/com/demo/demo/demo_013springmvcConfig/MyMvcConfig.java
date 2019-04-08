/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MyMvcConfig
 * Author:   华哥一号
 * Date:     2019/4/2 15:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.demo.demo.demo_013springmvcConfig;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Chann
 * @create 2019/4/2
 * @since 1.0.0
 */
@Configuration
@ComponentScan("com.demo.demo")
//@EnableWebMvc+WebMvcConfigurationAdapt或者 WebMvcConfigurationSupport
public class MyMvcConfig extends WebMvcConfigurationSupport{
    //配置试视图解析器
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/classes/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setViewClass(JstlView.class);
        return viewResolver;
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
        //不拦截静态资源
        registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/assets/");
    }
    @Bean
    public MyInterceptor myInterceptor(){
        return new MyInterceptor();
    }

    /**
     * Override this method to add Spring MVC interceptors for
     * pre- and post-processing of controller invocation.
     *
     * @param registry
     * @see InterceptorRegistry
     */
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(myInterceptor());
    }
}
