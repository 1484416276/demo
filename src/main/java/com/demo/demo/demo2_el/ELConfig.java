/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ELConfig
 * Author:   华哥一号
 * Date:     2019/3/13 10:10
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.demo.demo.demo2_el;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.apache.commons.io.IOUtils;
import org.springframework.core.io.Resource;
import org.springframework.core.env.Environment;


/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Chann
 * @create 2019/3/13
 * @since 1.0.0
 */
@Configuration
@ComponentScan("com.demo.demo.demo2_el")
@PropertySource("classpath:com\\demo\\demo\\demo2_el\\text.properties")
public class ELConfig {
    @Value("I love you")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osname;

    @Value("#{T(java.lang.Math).random() * 100.0}")
    private String randomNum;

    @Value("#{demoService.another}")
    private String fromAnother;

    @Value("classpath:com/demo/demo/demo2_el/text.txt")
    private Resource testFile;

    @Value("http://www.baidu.com")
    private Resource testUrl;

    @Value("${book.name}")
    private String bookName;

    @Autowired
    private Environment environment;

    public void outputResource(){
        try {
            System.out.println(normal);
            System.out.println(osname);
            System.out.println(randomNum);
            System.out.println(fromAnother);
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }



}
