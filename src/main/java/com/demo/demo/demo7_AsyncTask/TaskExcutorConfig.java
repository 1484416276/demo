/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: TaskExcutorConfig
 * Author:   华哥一号
 * Date:     2019/3/14 11:39
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.demo.demo.demo7_AsyncTask;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;


/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Chann
 * @create 2019/3/14
 * @since 1.0.0
 */
@Configuration
@ComponentScan("com.demo.demo.demo7_AsyncTask")
@EnableAsync
public class TaskExcutorConfig{
    @Bean
    public Executor executor(){
        return new ThreadPoolTaskExecutor();
    }
}
