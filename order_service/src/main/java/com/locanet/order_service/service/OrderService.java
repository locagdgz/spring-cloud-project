package com.locanet.order_service.service;

import com.locanet.order_service.domain.Order;

/**
 * Date: 2019/8/19
 * Author: LocaCham
 */
public interface OrderService {

    public Object save(String userId,int productId);
}
