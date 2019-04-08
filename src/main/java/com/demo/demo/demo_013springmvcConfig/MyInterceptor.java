/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MyInterceptor
 * Author:   华哥一号
 * Date:     2019/4/2 16:23
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.demo.demo.demo_013springmvcConfig;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 * 自定义拦截器，还需注册到config
 * @author Chann
 * @create 2019/4/2
 * @since 1.0.0
 */
public class MyInterceptor extends HandlerInterceptorAdapter{
    public MyInterceptor() {
        super();
    }

    /**
     * This implementation always returns {@code true}.
     *
     * @param request
     * @param response
     * @param handler
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        long starTime = System.currentTimeMillis();
        request.setAttribute("starTime",starTime);

        return true;
    }

    /**
     * This implementation is empty.
     *请求完成的时间-请求开始的时间= 处理请求的时间
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        long starTime = (Long) request.getAttribute("starTime");
        long endTime = System.currentTimeMillis();
        request.removeAttribute("starTime");
        long handlingTime = endTime - starTime;
        request.setAttribute("handlingTime",handlingTime);
    }

    /**
     * This implementation is empty.
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }

    /**
     * This implementation is empty.
     *
     * @param request
     * @param response
     * @param handler
     */
    @Override
    public void afterConcurrentHandlingStarted(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        super.afterConcurrentHandlingStarted(request, response, handler);
    }
}
