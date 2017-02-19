package com.irelandlight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/**
 * Created by mr.w on 2017/2/18.
 */
@Controller
@RequestMapping("/")
public class TestController
{
    @RequestMapping("/login")
    public ModelAndView login(String name,String pwd){
        ModelAndView mv = new ModelAndView();
        System.out.println("进入了控制器的viewAll方法。。。");
        System.out.println("name"+name);
        System.out.println("pwd"+pwd);
        mv.setViewName("/hello.jsp");
        return mv;
    }
}
