package com.immoc.sell.service;

import com.immoc.sell.dto.OrderDTO;

/**
 * 描述:
 * 买家service接口
 *
 * @outhor Leo
 * @create 2018-03-04 下午 10:15
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
