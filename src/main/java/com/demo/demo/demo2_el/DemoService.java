/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: DemoService
 * Author:   华哥一号
 * Date:     2019/3/13 10:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.demo.demo.demo2_el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Chann
 * @create 2019/3/13
 * @since 1.0.0
 */
@Service
public class DemoService {
    @Value("其他属性")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
