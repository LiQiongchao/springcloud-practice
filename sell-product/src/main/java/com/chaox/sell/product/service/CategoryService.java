package com.chaox.sell.product.service;

import com.chaox.sell.product.model.ProductCategory;

import java.util.List;

/**
 * @Author: LiQiongchao
 * @Date: 2019/6/21 0:22
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypes);

}
