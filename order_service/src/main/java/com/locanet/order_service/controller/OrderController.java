package com.locanet.order_service.controller;

import com.locanet.order_service.service.OrderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * Date: 2019/8/19
 * Author: LocaCham
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/save")
    @HystrixCommand(fallbackMethod = "saveOrderFail")
    public Object save(@RequestParam("user_id")String userId, @RequestParam("product_id")int productId){
        HashMap<String,Object> map = new HashMap<>();
        map.put("code","0");
        map.put("msg",orderService.save(userId,productId));
        return map;
    }

    private Object saveOrderFail(String userId, int productId){
        HashMap<String ,String> map = new HashMap<>();
        map.put("code","-1");
        map.put("msg","请求数量过多，请稍后再试");
        return map;
    }
}
