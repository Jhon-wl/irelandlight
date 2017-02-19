package com.irelandlight.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by mr.w on 2017/2/19.
 */
public interface GetNickNameMapper {
    //获取用户的昵称
    String selectNickName(@Param("openid") int openid)throws Exception;
}
