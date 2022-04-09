package com.duverolin.mapper;

import com.duverolin.entity.NickUser;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("nickUserMapper")
@Mapper
public interface NickUserMapper {

    @Select("select * from NickUser")
    List<NickUser> selectAllnickUsers();

    @Insert("insert into NickUser VALUES(null,#{nickLoginName},#{nickName},#{nickPassword},#{nickImg},#{nickRealName},#{nickTelephone},#{nickSex}," +
            "#{nickBrithday},#{nickIntro},#{nickScore},#{nickRegisterTime},#{nickStatus})")
    int addNickUser(NickUser nickUser);

    @Update("update NickUser set nickName=#{nickName},nickPassword=#{nickPassword},nickImg=#{nickImg},nickRealName=#{nickRealName}," +
            "nickTelephone=#{nickTelephone},nickSex=#{nickSex},nickBrithday=#{nickBrithday},nickIntro=#{nickIntro} where nickId = #{nickId}")
    int updateNickUser(NickUser nickUser);

    @Delete("delete from NickUser where nickId=#{nickId}")
    int deleteNickUserById(Integer nickId);

    @Select("select count(*) from NickUser where nickLoginName = #{nickLoginName}")
    int queryNickLoginName(String nickLoginName);


}
