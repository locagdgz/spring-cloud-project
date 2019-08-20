package com.locanet.order_service.service.impl;

import com.fasterxml.jackson.databind.JsonNode;
import com.locanet.order_service.domain.Order;
import com.locanet.order_service.service.OrderService;
import com.locanet.order_service.service.ProductClient;
import com.locanet.order_service.utils.JsonUtils;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

/**
 * Date: 2019/8/19
 * Author: LocaCham
 */
@Service
public class OrderServiceImpl implements OrderService {


    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ProductClient productClient;

    @Override
    //@HystrixCommand(fallbackMethod = "saveOrderFail")
//    public Order save(String userId, int productId) {
//        System.out.println("============findById============");
//        String response = productClient.findById(productId);
//        JsonNode jsonNode = JsonUtils.str2JsonNode(response);
//        System.out.println(jsonNode);
//        System.out.println("============getProductList============");
//        String productList = productClient.getProductList();
//        if (StringUtils.isNotBlank(productList)) {
//            JsonNode jsonNode1 = JsonUtils.str2JsonNode(productList);
//            if (!jsonNode1.isNull()) {
//                System.out.println(jsonNode1.get(2).get("name"));
//            }
//        }
//        Order order = new Order(1,userId+"Tom","Tom",productId,UUID.randomUUID().toString(),2869.3,new Date());
//        return order;
//    }
    public Object save(String userId, int productId) {
        HashMap<String,String> map = new HashMap<>();
        if (productId == 1) {

            return null;
        }
//        Systemout.println(jsonNode);
        System.out.println("============getProductList============");
        Object productList = productClient.getProductList();

        return productList;
    }

//    @Override
//    public Order save(String userId, String productId) {
//        System.out.println("userId" + userId);
//        System.out.println("productId" + productId);
//        //Object object = restTemplate.getForObject("http://product-service/product/findById?id=" + productId, Object.class);
//        Object object = restTemplate.getForObject("http://product-service/product/list", Object.class);
//        System.out.println("=================object:"+object);
//
//        Order order = new Order(1,userId+"Tom","Tom",productId,UUID.randomUUID().toString(),2869.3,new Date());
//        return order;
//    }
}
