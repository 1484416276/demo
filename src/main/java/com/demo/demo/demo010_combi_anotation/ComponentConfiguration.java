package com.demo.demo.demo010_combi_anotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;
/**
 * 功能描述: <br>
 * 〈〉
 *组合注解
 * @ComponentConfiguration = @ComponentScan+@Configuration

 * @return:
 * @since: 1.0.0
 * @Author: 华哥一号
 * @Date: 2019/3/14 15:16
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@ComponentScan
public @interface ComponentConfiguration {
    String[] value() default {};
}
