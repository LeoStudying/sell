package com.immoc.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 描述:
 * 商品实体类
 *
 * @outhor Leo
 * @create 2018-02-10 下午 9:42
 */
@Entity
@DynamicUpdate
@Data
public class ProductInfo {

    /** 商品Id */
    @Id
    private String productId;

    /** 商品名称 */
    private String productName;

    /** 单价 */
    private BigDecimal productPrice;

    /** 库存 */
    private Integer productStock;

    /** 描述 */
    private String productDescription;

    /** 小图 */
    private String productIcon;

    /** 商品状态 0正常1下架*/
    private Integer productStatus;

    /** 类目编号 */
    private Integer categoryType;

    public ProductInfo() {}

}