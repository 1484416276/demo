/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: DemoPublisher
 * Author:   华哥一号
 * Date:     2019/3/14 10:35
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.demo.demo.demo5_event_Listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Chann
 * @create 2019/3/14
 * @since 1.0.0
 */
@Component
public class DemoPublisher {

    @Autowired
    ApplicationContext context;

    public void publish(String msg){
        context.publishEvent(new DemoEvent(this,msg));
    }

}
