package com.locanet.order_service.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Date: 2019/8/19
 * Author: LocaCham
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private int id;

    private String userId;

    private String userName;

    private int name;

    private String tradeNo;

    private double price;

    private Date createTime;
}
