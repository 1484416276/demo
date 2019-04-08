/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: demo5_Event_Listener
 * Author:   华哥一号
 * Date:     2019/3/14 10:13
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.demo.demo.demo5_event_Listener;

import org.springframework.context.ApplicationEvent;
import sun.applet.resources.MsgAppletViewer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Chann
 * @create 2019/3/14
 * @since 1.0.0
 */
public class DemoEvent extends ApplicationEvent{
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg=msg;

    }
}
