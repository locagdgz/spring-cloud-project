package com.locanet.products_service.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Date: 2019/8/19
 * Author: LocaCham
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {

    /**
     * 商品id
     */
    private int id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品价格
     */
    private double price;

    /**
     * 商品库存
     */
    private int store;

}
