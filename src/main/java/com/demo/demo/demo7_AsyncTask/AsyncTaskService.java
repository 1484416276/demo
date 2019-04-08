/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: AsyncTaskService
 * Author:   华哥一号
 * Date:     2019/3/14 13:20
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.demo.demo.demo7_AsyncTask;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Chann
 * @create 2019/3/14
 * @since 1.0.0
 */
@Service
public class AsyncTaskService {
    @Async
    public void AsyncTaskA(Integer i){
        System.out.println("任务A:"+i);
    }
    @Async
    public void AsyncTaskB(Integer i){
        System.out.println("任务B:"+i);
    }
}
