package com.locanet.order_service.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Date: 2019/8/19
 * Author: LocaCham
 */
public class JsonUtils {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    /**
     * Json字符串转JsonNode的方法
     */
    public static JsonNode str2JsonNode(String str) {
        try {
            return OBJECT_MAPPER.readTree(str);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
