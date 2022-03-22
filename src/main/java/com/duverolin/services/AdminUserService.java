package com.duverolin.services;

import com.duverolin.entity.AdminUser;
import com.duverolin.mapper.AdminUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("adminUserService")
public class AdminUserService {
    private AdminUserMapper adminUserMapper;

    @Resource
    public void setAdminUserMapper(AdminUserMapper adminUserMapper) {
        this.adminUserMapper = adminUserMapper;
    }

    public AdminUser adminLogin(AdminUser adminUser) {
        return adminUserMapper.adminLogin(adminUser);
    }

}
