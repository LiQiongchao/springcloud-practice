package com.chaox.sell.product.service.impl;

import com.chaox.sell.product.ProductApplicationTests;
import com.chaox.sell.product.model.ProductCategory;
import com.chaox.sell.product.service.CategoryService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: LiQiongchao
 * @Date: 2019/6/21 0:25
 */
@Component
public class CategoryServiceImplTest extends ProductApplicationTests {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> byCategoryTypeIn = categoryService.findByCategoryTypeIn(Arrays.asList(1, 2));
        Assert.assertTrue(byCategoryTypeIn.size() > 0);
    }
}