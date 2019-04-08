/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: DemoListener
 * Author:   华哥一号
 * Date:     2019/3/14 10:24
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.demo.demo.demo5_event_Listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.awt.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Chann
 * @create 2019/3/14
 * @since 1.0.0
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("我{bean-DemoListener接收到了bean-DemoPublish发布的消息"+msg);
    }
}
