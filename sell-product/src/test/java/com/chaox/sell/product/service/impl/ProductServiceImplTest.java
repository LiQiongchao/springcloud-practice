package com.chaox.sell.product.service.impl;

import com.chaox.sell.product.ProductApplicationTests;
import com.chaox.sell.product.model.ProductInfo;
import com.chaox.sell.product.repository.ProductInfoRepository;
import com.chaox.sell.product.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: LiQiongchao
 * @Date: 2019/6/21 0:20
 */
@Component
public class ProductServiceImplTest extends ProductApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void findAll() {
        List<ProductInfo> all = productService.findAll();
        Assert.assertTrue(all.size() > 0);
    }
}