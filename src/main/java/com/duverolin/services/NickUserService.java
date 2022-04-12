package com.duverolin.services;

import com.duverolin.entity.NickUser;
import com.duverolin.mapper.NickUserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("nickUserService")
public class NickUserService {

    private NickUserMapper nickUserMapper;

    @Resource//使用Set方法根据byName依赖注入nickUserMapper
    public void setNickUserMapper(NickUserMapper nickUserMapper) {
        this.nickUserMapper = nickUserMapper;
    }

    /**
     * 查询所有nickUser信息
     */
    @Transactional(rollbackFor = Exception.class)
    public List<NickUser> selectAllnickUsers() {
        return nickUserMapper.selectAllnickUsers();
    }

    /**
     * 添加Nick用户
     */
    @Transactional(rollbackFor = Exception.class)
    public int addNickUser(NickUser nickUser) {
        return nickUserMapper.addNickUser(nickUser);
    }

    /**
     * 根据Id标识修改用户信息
     */
    @Transactional(rollbackFor = Exception.class)
    public int updateNickUser(NickUser nickUser) {
        return nickUserMapper.updateNickUser(nickUser);
    }

    /**
     * 根据Id删除这条数据
     */
    @Transactional(rollbackFor = Exception.class)
    public int deleteNickUserById(Integer nickId) {
        return nickUserMapper.deleteNickUserById(nickId);
    }

    /**
     * 查询是否已存在这个用户
     */
    @Transactional(rollbackFor = Exception.class)
    public int queryNickLoginName(String nickLoginName) {
        return nickUserMapper.queryNickLoginName(nickLoginName);
    }

    /**
     * 根据输入值查询用户
     */
    public List<NickUser> selectNickUsersByName(String nickName) {
        return nickUserMapper.selectNickUsersByName(nickName);
    }
}
