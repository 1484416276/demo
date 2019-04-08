/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ScheduledTaskService
 * Author:   华哥一号
 * Date:     2019/3/14 13:35
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.demo.demo.demo8_scheduleTask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Chann
 * @create 2019/3/14
 * @since 1.0.0
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat DATE_FORMAT =new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 5000)
    public void fixTimeExecution1(){
        System.out.println("每隔5秒执行一次"+DATE_FORMAT.format(new Date()));
    }
    //on the second as well as minute, hour, day of month, month and day of week.
    @Scheduled(cron = "0/6 04 14 * 3 *")
    public void fixTimeExecution2(){
        System.out.println("匹配时间任务"+DATE_FORMAT.format(new Date()));
    }
}
