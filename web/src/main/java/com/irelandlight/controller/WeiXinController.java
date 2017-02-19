package com.irelandlight.controller;

import com.irelandlight.util.AuthUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.sql.*;

/**
 * Created by mr.w on 2017/2/19.
 */
@Controller
@RequestMapping("/")
public class WeiXinController {


    @RequestMapping("/wxLogin")
    public void wxLogin(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String backUrl="http://katelina.ngrok.cc/WeiXinAuth/wxCallBack";
        String url="https://open.weixin.qq.com/connect/oauth2/authorize?appid=" + AuthUtil.APPID +
                "&redirect_uri=" + URLEncoder.encode(backUrl,"UTF-8") +
                "&response_type=code" +
                "&scope=snsapi_userinfo" +
                "&state=STATE#wechat_redirect";
        resp.sendRedirect(url);
    }
}
