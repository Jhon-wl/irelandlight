package com.irelandlight.service.serviceimpl;

import com.irelandlight.mapper.UpdateUserMapper;
import com.irelandlight.service.UpdateUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by mr.w on 2017/2/20.
 */
@Service
public class UpdateUserServiceImpl {
    @Resource
    private UpdateUserMapper updateUserMapper;
    public void UpdateUser()throws Exception{
        updateUserMapper.UpdateUser();;
    }
}
