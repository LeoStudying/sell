package com.immoc.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 描述:
 * 订单详情
 *
 * @outhor Leo
 * @create 2018-02-27 下午 9:49
 */
@Entity
@Data
public class OrderDetail {

    /** 订单详情Id*/
    @Id
    private String detailId;
    /** 订单Id*/
    private String orderId;
    /** 商品Id*/
    private String productId;
    /** 商品名称*/
    private String productName;
    /** 商品价格*/
    private BigDecimal productPrice;
    /** 商品数量*/
    private Integer productQuantity;
    /** 小图*/
    private String productIcon;

}