/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ProfileConfig
 * Author:   华哥一号
 * Date:     2019/3/14 9:44
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.demo.demo.demo011_test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Chann
 * @create 2019/3/14
 * @since 1.0.0
 */
@Configuration
public class ProfileConfig1 {
    @Bean
    @Profile("dev")
    public DemoBean1 devDemoBean(){
        return  new DemoBean1("from dev profle");
    }
    @Bean
    @Profile("pro")
    public DemoBean1 proDemoBean(){
        return  new DemoBean1("from pro profle");
    }
}
