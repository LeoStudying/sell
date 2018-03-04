package com.immoc.sell.repository;

import com.immoc.sell.dataobject.OrderDetail;
import com.immoc.sell.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 描述:
 * 订单详情接口
 *
 * @outhor Leo
 * @create 2018-02-27 下午 9:58
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    List<OrderDetail> findByOrderId(String orderId);

}