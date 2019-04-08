/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Controller
 * Author:   华哥一号
 * Date:     2019/3/18 10:03
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.demo.demo.demo_012springmvc_jsp;


import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Chann
 * @create 2019/3/18
 * @since 1.0.0
 */
@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/index")
    public String toIndex(){
        return "index";
    }
}
