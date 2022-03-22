package com.duverolin.controller;

import com.duverolin.entity.AdminUser;
import com.duverolin.services.AdminUserService;
import com.duverolin.utils.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/")
public class AdminUserController {


    final Map<String, Object> map = new HashMap<>();
    private AdminUserService adminUserService;

    @Autowired
    public void setAdminUserService(AdminUserService adminUserService) {
        this.adminUserService = adminUserService;
    }

    // 管理员登陆
    @RequestMapping("adminLogin.do")
    public Object adminLogin(AdminUser user) {
        System.out.println(user.getAdminUserName());
        AdminUser adminUser = adminUserService.adminLogin(user);
        if (adminUser != null) {
            if (adminUser.getAdminUserStatus() == 1) {
                return WebUtils.responseSuccess(adminUser);
            } else if (adminUser.getAdminUserStatus() == 0) {
                map.put("code", "0");
                return map;
            } else {
                map.put("code", "-1");
                return map;
            }
        } else {
            return WebUtils.responseError("错误");
        }
    }
}
