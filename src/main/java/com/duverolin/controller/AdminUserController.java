package com.duverolin.controller;

import com.duverolin.entity.AdminUser;
import com.duverolin.services.AdminUserService;
import com.duverolin.utils.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/")
public class AdminUserController {


    private AdminUserService adminUserService;

    @Autowired
    public void setAdminUserService(AdminUserService adminUserService) {
        this.adminUserService = adminUserService;
    }

    // 管理员登陆
    @RequestMapping("adminLogin.do")
    public Object adminLogin(@RequestBody AdminUser user) {
        AdminUser adminUser = adminUserService.adminLogin(user);
        if (adminUser != null) {
            if (adminUser.getAdminUserStatus() == 1) {
                return WebUtils.responseSuccess("success");
            } else if (adminUser.getAdminUserStatus() == 0) {
                return WebUtils.responseSuccess();
            } else {
                return WebUtils.responseError("error");
            }
        } else {
            return WebUtils.responseError("错误");
        }
    }
}
