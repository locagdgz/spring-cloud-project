package com.locanet.products_service.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import com.locanet.products_service.domain.Product;
import com.locanet.products_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Date: 2019/8/19
 * Author: LocaCham
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Value("${server.port}")
    private int port;

    @Autowired
    private ProductService productService;

    @RequestMapping("/list")
    public Object list(){

        try {
            System.out.println("线程睡眠3秒开始。。" + new SimpleDateFormat("yyyMMdd-hh:MM:ss").format(new Date()));
            TimeUnit.SECONDS.sleep(3);
            System.out.println("线程睡眠3秒完成。。" + new SimpleDateFormat("yyyMMdd-hh:MM:ss").format(new Date()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<Product> productList = productService.getProductList();
        Product port = new Product(10086,"端口号:"+this.port,1.00,123);
        productList.add(port);
        return productList;
    }

    @RequestMapping("/findById")
    public Object findById(@RequestParam("id") int id) {
        return productService.findProductById(id);
    }

}
