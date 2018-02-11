package com.immoc.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 描述:
 * 商品详情
 *
 * @outhor Leo
 * @create 2018-02-11 下午 1:49
 */
@Data
public class ProductInfoVo {

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String getProductDescription;

    @JsonProperty("icon")
    private String productIcon;


}