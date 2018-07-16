package com.immoc.sell.service;

import com.immoc.sell.dto.OrderDTO;
import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;

/**
 * 描述:
 * 支付
 *
 * @outhor Leo
 * @create 2018-03-11 下午 4:39
 */
public interface PayService {

    PayResponse create(OrderDTO orderDTO);

    PayResponse notify(String notifyData);

    RefundResponse refund(OrderDTO orderDTO);

}