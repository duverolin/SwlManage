package com.duverolin.mapper;

import com.duverolin.entity.NickUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("nickUserMapper")
public interface NickUserMapper {
    /*查询所有nickUser信息*/
    @Select("select * from NickUser")
    List<NickUser> selectAllnickUsers();
}
