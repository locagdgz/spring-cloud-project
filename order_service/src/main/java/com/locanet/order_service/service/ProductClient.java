package com.locanet.order_service.service;

import com.locanet.order_service.fallback.ProductClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Date: 2019/8/19
 * Author: LocaCham
 */
@FeignClient(name = "product-service",fallback = ProductClientFallback.class)
public interface ProductClient {

    @GetMapping("/product/findById")
    Object findById(@RequestParam(value = "id") int id);

    @GetMapping("/product/list")
    Object getProductList();
}
