package com.chaox.sell.product.repository;

import com.chaox.sell.product.model.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: LiQiongchao
 * @Date: 2019/6/18 22:46
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    List<ProductInfo> findByProductStatus(Integer status);

}
