package com.duverolin.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * web相应工具类 提供 成功 失败 未登录 请求未认证 响应结构
 */
public class WebUtils {
    //响应成功
    public static Map<String, Object> responseSuccess(Object object) {
        Map<String, Object> m = new HashMap<>();
        m.put("code", 1);
        m.put("data", object);
        return m;
    }

    //响应失败
    public static Map<String, Object> responseError(String msg) {
        Map<String, Object> m = new HashMap<>();
        m.put("code", -1);
        m.put("msg", msg);
        return m;
    }

}
