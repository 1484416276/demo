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
package com.demo.demo.demo7_AsyncTask;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Chann
 * @create 2019/3/14
 * @since 1.0.0
 */
public class TestAysncTask {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExcutorConfig.class);
        AsyncTaskService taskService = context.getBean(AsyncTaskService.class);
        for (int i=0;i<10;i++){
            taskService.AsyncTaskA(i);
            taskService.AsyncTaskB(i);
        }
    }
}
