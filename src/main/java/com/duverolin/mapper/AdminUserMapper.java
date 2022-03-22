package com.duverolin.mapper;

import com.duverolin.entity.AdminUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
@Mapper
@Repository("adminUserMapper")
public interface AdminUserMapper {
    @Select("select * from AdminUser where adminUserName = #{adminUserName} and adminPassword = #{adminPassword}")
    AdminUser adminLogin(AdminUser adminUser);
}
