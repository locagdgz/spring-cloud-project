package com.locanet.order_service.fallback;

import com.locanet.order_service.service.ProductClient;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 * Date: 2019/8/20
 * Author: LocaCham
 */
@Component
public class ProductClientFallback implements ProductClient {

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public Object findById(int id) {
        System.out.println("ProductClientFallback:===findById");
        return null;
    }

//    @Override
//    public String getProductList() {
//        System.out.println("ProductClientFallback:===getProductList");
//
//        String saveOrderKey = "save-order";
//
//        String sendValue = (String) redisTemplate.opsForValue().get(saveOrderKey);
//        System.out.println("============"+sendValue);
//        if (!StringUtils.isNotBlank(sendValue)) {
//            new Thread(() -> {
//                System.out.println("执行redis线程");
//                redisTemplate.opsForValue().set(saveOrderKey,"save-order-fail",20,TimeUnit.SECONDS);
//            }).start();
//        } else {
//            System.out.println("已经发送过短信啦~~");
//        }
//        return null;
//    }
    @Override
    public Object getProductList() {
        System.out.println("ProductClientFallback:===getProductList");
//        HashMap<String ,String> map = new HashMap<>();
//        map.put("code","-1");
//        map.put("msg","请求数量过多，请稍后再试");
        return null;
    }
}
