/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ForTest
 * Author:   华哥一号
 * Date:     2019/3/14 15:46
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.demo.demo;

import com.demo.demo.demo011_test.DemoBean1;
import com.demo.demo.demo011_test.ProfileConfig1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Chann
 * @create 2019/3/14
 * @since 1.0.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ProfileConfig1.class})
@ActiveProfiles("dev")
public class ForTest {
    @Autowired
    DemoBean1 demoBean1;
    @Test
    public void test(){
       String expected = "from pro profle";
        String actual = demoBean1.getContent();
        Assert.assertEquals(expected,actual);//不匹配时junit报错
    }
}
