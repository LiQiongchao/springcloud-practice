package com.chaox.sell.product.service;

import com.chaox.sell.product.model.ProductInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: LiQiongchao
 * @Date: 2019/6/21 0:13
 */
public interface ProductService {

    List<ProductInfo> findAll();

}
