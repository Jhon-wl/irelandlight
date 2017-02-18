package com.irelandlight.mapper;

import com.irelandlight.vo.NewsContent;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mr.w on 2016/12/9.
 */
@Repository
public interface News {
    //查询公告的id,content,title,productorName
    List<NewsContent> selectNewsContent()throws Exception;
}
