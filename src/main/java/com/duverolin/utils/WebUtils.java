package com.duverolin.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * web相应工具类 提供 成功 失败 未登录 请求未认证 响应结构
 */
public class WebUtils {
    static final Map<String, Object> map = new HashMap<>();
    //响应成功
    public static Map<String, Object> responseSuccess(Object object) {
        map.put("code", 1);
        map.put("data", object);
        return map;
    }

    public static Map<String, Object> responseSuccess(){
        map.put("code", 0);
        return map;
    }

    //响应失败
    public static Map<String, Object> responseError(String msg) {
        map.put("code", -1);
        map.put("msg", msg);
        return map;
    }

}
