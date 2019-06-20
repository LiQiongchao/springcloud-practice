package com.chaox.sell.product.service.impl;

import com.chaox.sell.product.model.ProductCategory;
import com.chaox.sell.product.repository.ProductCategoryRepository;
import com.chaox.sell.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: LiQiongchao
 * @Date: 2019/6/21 0:24
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypes) {
        return productCategoryRepository.findByCategoryTypeIn(categoryTypes);
    }
}
