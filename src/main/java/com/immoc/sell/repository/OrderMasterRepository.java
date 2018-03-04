package com.immoc.sell.repository;

import com.immoc.sell.dataobject.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 描述:
 * 订单接口
 *
 * @outhor Leo
 * @create 2018-02-27 下午 9:58
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {

    Page<OrderMaster> findByBuyerOpenid(String buyeropenid, Pageable pageable);

}