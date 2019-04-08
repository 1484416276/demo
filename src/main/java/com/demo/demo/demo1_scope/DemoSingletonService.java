/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: DemoSingletonService
 * Author:   华哥一号
 * Date:     2019/3/13 9:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.demo.demo.demo1_scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 〈测试Bean 的Scope  〉<br>
 *     singleton      单例 *
 *     Prototype      每次调用新建一个
 *     request         http request 创建一个
 *     session         http session 创建一个
 *     globalsession
 *
 *
 * 〈〉
 *
 * @author Chann
 * @create 2019/3/13
 * @since 1.0.0
 */
@Service
@Scope("singleton")
public class DemoSingletonService {

}
@Service
@Scope("prototype")
class DemoPrototypeService{

}
