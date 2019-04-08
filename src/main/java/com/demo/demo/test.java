/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: test
 * Author:   华哥一号
 * Date:     2019/3/14 9:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.demo.demo;

import com.demo.demo.demo3_bean_init_destrory.BeanService;
import com.demo.demo.demo3_bean_init_destrory.InitDestroyConfig;
import com.demo.demo.demo4_profile.DemoBean;
import com.demo.demo.demo4_profile.ProfileConfig;
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
public class test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        BeanService beanService = context.getBean(BeanService.class);

        //profiles
        context.getEnvironment().addActiveProfile("pro");
        context.register(ProfileConfig.class);
        context.refresh();
        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());

        //listner-event
        context.register(EventListenerConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("hello" +
                "appcation event");

        context.close();

    }
}
