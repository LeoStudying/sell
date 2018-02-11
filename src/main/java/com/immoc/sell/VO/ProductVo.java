package com.immoc.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.immoc.sell.dataobject.ProductInfo;
import lombok.Data;

import java.util.List;

/**
 * 描述:
 * 商品(包含类目)
 *
 * @outhor Leo
 * @create 2018-02-11 下午 1:45
 */
@Data
public class ProductVo {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVo> productInfoVoList;

}