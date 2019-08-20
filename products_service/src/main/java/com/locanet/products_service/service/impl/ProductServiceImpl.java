package com.locanet.products_service.service.impl;

import com.locanet.products_service.domain.Product;
import com.locanet.products_service.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Date: 2019/8/19
 * Author: LocaCham
 */
@Service
public class ProductServiceImpl implements ProductService {

    private static Map<Integer,Product> daoMap = new HashMap<>();

    static {
        Product p1 = new Product(1,"菠萝",2.53,20);
        Product p2 = new Product(2,"苹果",11.3,201);
       // Product p3 = new Product(3,"车厘子",39,89);
       // Product p4 = new Product(4,"山竹",16,158);
        //Product p5 = new Product(5,"三华李",2.53,366);
        //Product p6 = new Product(6,"椰子",1.68,75);
        daoMap.put(p1.getId(),p1);
        daoMap.put(p2.getId(),p2);
//        daoMap.put(p3.getId(),p3);
//        daoMap.put(p4.getId(),p4);
//        daoMap.put(p5.getId(),p5);
//        daoMap.put(p6.getId(),p6);


    }

    @Override
    public List<Product> getProductList() {
        return new ArrayList<>(daoMap.values());
    }

    @Override
    public Product findProductById(int id) {
        return daoMap.get(id);
    }
}
