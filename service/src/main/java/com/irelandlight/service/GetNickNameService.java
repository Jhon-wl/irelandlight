package com.irelandlight.service;

import com.irelandlight.mapper.GetNickNameMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.testng.annotations.Test;

import javax.annotation.Resource;

/**
 * Created by mr.w on 2017/2/19.
 */
public interface GetNickNameService {
    public String GetNickNameService(int openid)throws  Exception;

}
