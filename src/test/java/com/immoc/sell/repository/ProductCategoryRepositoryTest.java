package com.immoc.sell.repository;

import com.immoc.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = productCategoryRepository.findOne(1);
        System.out.println(productCategory.toString());
    }

    @Test
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("女生最爱");
        productCategory.setCategoryType(3);
        productCategoryRepository.save(productCategory);

    }

    @Test
    @Transactional
    public void save1Test() {
        ProductCategory productCategory = new ProductCategory("男生最爱", 4);
        ProductCategory result = productCategoryRepository.save(productCategory);
        Assert.assertNotNull(result);

    }

    @Test
    public void updateTest() {
        ProductCategory productCategory = productCategoryRepository.findOne(2);
        productCategory.setCategoryType(10);
        productCategoryRepository.save(productCategory);

    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> list = Arrays.asList(2,3);
        List<ProductCategory> result = productCategoryRepository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result);
    }
}