package com.irelandlight.service;

import com.irelandlight.mapper.UpdateUserMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by mr.w on 2017/2/20.
 */
@Repository
public interface UpdateUserService {

    public void UpdateUser()throws Exception;

}
