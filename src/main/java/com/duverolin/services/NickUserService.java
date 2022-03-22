package com.duverolin.services;

import com.duverolin.entity.NickUser;
import com.duverolin.mapper.NickUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("nickUserService")
public class NickUserService {

    private NickUserMapper nickUserMapper;

    @Resource//使用Set方法根据byName依赖注入nickUserMapper
    public void setNickUserMapper(NickUserMapper nickUserMapper) {
        this.nickUserMapper = nickUserMapper;
    }

    /*查询所有nickUser信息*/
    public List<NickUser> selectAllnickUsers() {
        return nickUserMapper.selectAllnickUsers();
    }
}
