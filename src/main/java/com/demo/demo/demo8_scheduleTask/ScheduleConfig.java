/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ScheduleConfig
 * Author:   华哥一号
 * Date:     2019/3/14 13:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.demo.demo.demo8_scheduleTask;

import com.demo.demo.demo010_combi_anotation.ComponentConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Chann
 * @create 2019/3/14
 * @since 1.0.0
 */

@ComponentConfiguration("com.demo.demo.demo8_scheduleTask")
@EnableScheduling
public class ScheduleConfig {

}
