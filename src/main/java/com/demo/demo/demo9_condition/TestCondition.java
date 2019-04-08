/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: TestAysncTask
 * Author:   华哥一号
 * Date:     2019/3/14 13:24
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.demo.demo.demo9_condition;

import com.demo.demo.demo8_scheduleTask.ScheduleConfig;
import com.demo.demo.demo8_scheduleTask.ScheduledTaskService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Chann
 * @create 2019/3/14
 * @since 1.0.0
 */
public class TestCondition {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService Service = context.getBean(ListService.class);

        System.out.println("当前系统为："+context.getEnvironment().getProperty("os.name")+",显示当前目录的命令为："+Service.showListCmd());


    }
}
