package com.immoc.sell.service.impl;


import com.immoc.sell.dataobject.ProductInfo;
import com.immoc.sell.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productInfoService;

    @Test
    public void findOne() {
        ProductInfo result = productInfoService.findOne("123");
        Assert.assertNotNull(result);

    }

    @Test
    public void findUpAll() {
        List<ProductInfo> resultList = productInfoService.findUpAll();
        Assert.assertNotEquals(0, resultList.size());
    }

    @Test
    public void findAll() {
        PageRequest request = new PageRequest(0, 2);
        Page<ProductInfo> page = productInfoService.findAll(request);
        //System.out.println(page.getTotalElements());
        Assert.assertNotEquals(0, page.getTotalElements());
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("124");
        productInfo.setProductName("皮皮虾");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("好吃的虾");
        productInfo.setProductIcon("http://xxxx.jpg");
        productInfo.setProductStatus(ProductStatusEnum.Down.getCode());
        productInfo.setCategoryType(2);

        ProductInfo result = productInfoService.save(productInfo);

        Assert.assertNotNull(result);

    }
}