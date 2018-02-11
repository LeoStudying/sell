package com.immoc.sell.service;

import com.immoc.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * 描述:
 * 类目service
 *
 * @outhor Leo
 * @create 2018-02-10 下午 9:11
 */
public interface ProductCategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);


}