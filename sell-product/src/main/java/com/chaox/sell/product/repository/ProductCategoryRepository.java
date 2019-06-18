package com.chaox.sell.product.repository;

import com.chaox.sell.product.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: LiQiongchao
 * @Date: 2019/6/18 23:27
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findByCategoryType(Integer categoryType);

}
