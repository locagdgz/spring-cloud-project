package com.locanet.products_service.service;

import com.locanet.products_service.domain.Product;

import java.util.List;

/**
 * Date: 2019/8/19
 * Author: LocaCham
 */
public interface ProductService {
    public List<Product> getProductList();

    public Product findProductById(int id);
}
