/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: BeanService
 * Author:   华哥一号
 * Date:     2019/3/14 9:22
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.demo.demo.demo3_bean_init_destrory;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Chann
 * @create 2019/3/14
 * @since 1.0.0
 */
public class BeanService {
    public void init(){
        System.out.println("初始化@init方法");
    }

    public BeanService(){
        super();
        System.out.println("构造方法");
    }
    public void destroy(){
        System.out.println("bean销毁方法");
    }

}
