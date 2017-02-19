package com.irelandlight.service.serviceimpl;

import com.irelandlight.mapper.GetNickNameMapper;
import com.irelandlight.service.GetNickNameService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by mr.w on 2017/2/19.
 */
@Service
public class GetNickNameServiceImpl implements GetNickNameService {
    @Resource
    private GetNickNameMapper getNickNameMapper;
    public String GetNickNameService(int openid) throws Exception {
        return getNickNameMapper.selectNickName(openid);
    }

}
