package com.irelandlight.Interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by mr.w on 2017/2/18.
 */
public class TestInterceptor implements HandlerInterceptor {
    public boolean preHandle
            (HttpServletRequest request, HttpServletResponse response,
             Object obj) throws Exception {
        System.out.println("执行到了preHandle方法");
        return false;
    }

    public void postHandle
            (HttpServletRequest request, HttpServletResponse response,
             Object obj, ModelAndView modelAndView) throws Exception {
        System.out.println("执行到了postHandle方法");
    }

    public void afterCompletion
            (HttpServletRequest request, HttpServletResponse response,
             Object obj, Exception e) throws Exception {
            System.out.println("执行到了afterCompletion方法");
    }
}
