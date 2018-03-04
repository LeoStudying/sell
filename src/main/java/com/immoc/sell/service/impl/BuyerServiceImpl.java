package com.immoc.sell.service.impl;

import com.immoc.sell.dto.OrderDTO;
import com.immoc.sell.enums.ResultEnum;
import com.immoc.sell.exception.SellException;
import com.immoc.sell.service.BuyerService;
import com.immoc.sell.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 描述:
 * 买家接口实现类
 *
 * @outhor Leo
 * @create 2018-03-04 下午 10:18
 */
@Service
@Slf4j
public class BuyerServiceImpl implements BuyerService {

    @Autowired
    private OrderService orderService;

    @Override
    public OrderDTO findOrderOne(String openid, String orderId) {
        return this.checkOrderOwner(openid, orderId);
    }

    @Override
    public OrderDTO cancelOrder(String openid, String orderId) {
        OrderDTO orderDTO = this.checkOrderOwner(openid, orderId);
        if (orderDTO == null) {
            log.error("[取消订单] 查不到改订单, orderId={}", orderId);
            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
        }

        return orderService.cancel(orderDTO);
    }

    private OrderDTO checkOrderOwner(String openid, String orderId) {
        OrderDTO orderDTO = orderService.findOne(orderId);
        if (orderDTO == null) {
            return null;
        }
        if (!orderDTO.getBuyerOpenid().equalsIgnoreCase(openid)) {
            log.error("[查询订单] 订单的openid不一致, openid={}, orderDTO={}", openid, orderDTO);
            throw new SellException(ResultEnum.ORDER_OWNER_ERROR);
        }

        return orderDTO;
    }
}