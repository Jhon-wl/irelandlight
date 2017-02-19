package com.irelandlight.service.serviceimpl;

import com.irelandlight.BaseJunitTest;
import com.irelandlight.model.Goods;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by mr.w on 2017/2/15.
 */

public class GoodsServiceImplTest extends BaseJunitTest{

    @Resource
    private GoodsServiceImpl goodsService;

    @Test
    public void findItemsList() throws Exception {
         List<Goods> list = goodsService.findItemsList();
         System.out.println("666");

    }

}