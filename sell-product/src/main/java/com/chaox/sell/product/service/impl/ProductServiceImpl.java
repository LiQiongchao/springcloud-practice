package com.chaox.sell.product.service.impl;

import com.chaox.sell.product.enums.ProductStatus;
import com.chaox.sell.product.model.ProductInfo;
import com.chaox.sell.product.repository.ProductInfoRepository;
import com.chaox.sell.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: LiQiongchao
 * @Date: 2019/6/21 0:15
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findAll() {
        return productInfoRepository.findByProductStatus(ProductStatus.UP.getCode());
    }
}
