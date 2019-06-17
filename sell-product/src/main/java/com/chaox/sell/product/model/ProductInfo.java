package com.chaox.sell.product.model;

import javafx.util.converter.LocalDateTimeStringConverter;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @Author: LiQiongchao
 * @Date: 2019/6/17 23:17
 */
@Data
public class ProductInfo {
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private Integer productStock;
    private String productDescription;
    private String productIcon;
    private Byte productStatus;
    private Integer categoryType;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
