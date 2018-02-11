package com.immoc.sell.repository;

import com.immoc.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 描述:
 * 商品Dao
 *
 * @outhor Leo
 * @create 2018-02-10 下午 9:53
 */
public interface ProductInfoRspository extends JpaRepository<ProductInfo, String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);


}