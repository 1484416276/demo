/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: testeventListner
 * Author:   华哥一号
 * Date:     2019/3/14 11:00
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.demo.demo.demo6_spring_bean_aware;

import com.demo.demo.demo5_event_Listener.DemoPublisher;
import com.demo.demo.demo5_event_Listener.EventListenerConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Chann
 * @create 2019/3/14
 * @since 1.0.0
 */
public class testAware {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);

       AwareService awareService =  context.getBean(AwareService.class);

        awareService.outputResult();
    }
}
