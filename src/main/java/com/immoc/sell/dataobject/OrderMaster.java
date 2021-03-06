package com.immoc.sell.dataobject;

import com.immoc.sell.enums.OrderStatusEnum;
import com.immoc.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * 描述:
 * 订单实体类
 *
 * @outhor Leo
 * @create 2018-02-12 下午 10:41
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {

    /**订单id */
    @Id
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
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /**支付状态,默认是为0未支付 */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    /**创建时间 */
    private Date createTime;

    /**更新时间 */
    private Date updateTime;
}