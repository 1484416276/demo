/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: LinuxListService
 * Author:   华哥一号
 * Date:     2019/3/14 14:36
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.demo.demo.demo9_condition;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Chann
 * @create 2019/3/14
 * @since 1.0.0
 */
public class LinuxListService implements ListService{

    @Override
    public String showListCmd() {
        return "ls";
    }
}
