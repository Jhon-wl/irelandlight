package com.irelandlight.service.serviceimpl;

import com.irelandlight.BaseJunitTest;
import org.junit.Test;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by mr.w on 2017/2/19.
 */
public class GetNickNameServiceImplTest extends BaseJunitTest{
    @Resource
    private GetNickNameServiceImpl getNickNameService;
    @Test
    public void getNickNameService() throws Exception {

        String s = getNickNameService.GetNickNameService(1);
        System.out.println("s");
    }

}