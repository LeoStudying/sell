package com.immoc.sell.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.immoc.sell.dataobject.OrderDetail;
import com.immoc.sell.dataobject.OrderMaster;
import com.immoc.sell.enums.OrderStatusEnum;
import com.immoc.sell.enums.PayStatusEnum;
import com.immoc.sell.utils.serializer.Date2LongSerializer;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

/**
 * 描述:
 * 订单数据传输对象
 *
 * @outhor Leo
 * @create 2018-03-04 下午 1:13
 */
@Data
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {

    /**订单id */
    private String orderId;

    /**买家名字 */
    private String buyerName;

    /**买家电话 */
    private String buyerPhone;

    /**买家地址 */
    private String buyerAddress;

    /**买家微信openid */
    private String buyerOpenid;

    /**订单总金额 */
    private BigDecimal orderAmount;

    /**订单状态 ,默认为新下单*/
    private Integer orderStatus;

    /**支付状态,默认是为0未支付 */
    private Integer payStatus;

    /**创建时间 */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    /**更新时间 */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    List<OrderDetail> orderDetailList;

}