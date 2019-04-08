/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: InitDestroyConfig
 * Author:   华哥一号
 * Date:     2019/3/14 9:29
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.demo.demo.demo3_bean_init_destrory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Chann
 * @create 2019/3/14
 * @since 1.0.0
 */
@Configuration
@ComponentScan("com.demo.demo.demo3_bean_init_destrory")
public class InitDestroyConfig {
    @Bean(initMethod = "init",destroyMethod = "destroy")
    BeanService beanService(){
        return new BeanService();
    }
}
