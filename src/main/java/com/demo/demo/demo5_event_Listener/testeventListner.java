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
package com.demo.demo.demo5_event_Listener;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Chann
 * @create 2019/3/14
 * @since 1.0.0
 */
public class testeventListner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventListenerConfig.class);

       DemoPublisher demoPublisher =  context.getBean(DemoPublisher.class);

        demoPublisher.publish("hallo application event");
    }
}
