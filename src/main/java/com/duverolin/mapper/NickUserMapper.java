package com.duverolin.mapper;

import com.duverolin.entity.NickUser;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("nickUserMapper")
public interface NickUserMapper {
    @Select("select * from NickUser")
    List<NickUser> selectAllnickUsers();
}
