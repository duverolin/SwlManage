package com.duverolin.controller;

import com.duverolin.entity.NickUser;
import com.duverolin.services.NickUserService;
import com.duverolin.utils.ImageUtils;
import com.duverolin.utils.WebUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@RestController
@RequestMapping("/api/")
public class NickUserController {

    private NickUserService nickUserService;

    @Autowired//使用Set方法自动注入nickUserService
    public void setNickUserService(NickUserService nickUserService) {
        this.nickUserService = nickUserService;
    }

    @RequestMapping("selectAllnickUsers.do")//分页查询所有NickUser
    public Object selectAllnickUsers(@RequestParam("pageNum") Integer pageNum, @RequestParam("pageSize") Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);//开启分页插件并指定第几页（pageNum），按多少条数据（pageSize）
        try {
            List<NickUser> nickUserList = nickUserService.selectAllnickUsers();//执行查询所有NickUser
            PageInfo<NickUser> pageInfo = new PageInfo<>(nickUserList);//查询出来的结果用PageInfo类封装
            if (pageInfo.getList() != null) {//判断查询出来的nickUserList有没有值
                return pageInfo;//返回pageInfo对象
            } else {
                return WebUtils.responseError("error");
            }
        } finally {
            PageHelper.clearPage();
        }
    }

    @PostMapping("selectNickUsersByName.do")//根据输入值查询相关用户
    public Object selectNickUsersByName(@RequestParam("nickName")String nickName){
        List<NickUser> nickUserList = nickUserService.selectNickUsersByName(nickName);
        if (nickUserList != null){
            return nickUserList;
        }else {
            return WebUtils.responseError("error");
        }
    }

    @RequestMapping("uploadImage.do")//上传保存Nick用户头像
    public Object uploadImage(@RequestParam("file") MultipartFile multipartFile) throws Exception {
        return ImageUtils.saveImage(multipartFile);
    }

    @GetMapping("deleteServerImageFile.do")//删除图片
    public Object deleteServerImageFile(@RequestParam("nickImg")String nickImg){
        return ImageUtils.deleteServerImageFile(nickImg);
    }

    @RequestMapping("validataLoginName.do")//验证用户名是否已注册
    public Object validataLoginName(@RequestParam("nickLoginName") String nickLoginName) {
        int result = nickUserService.queryNickLoginName(nickLoginName);
        if (result == 0) {
            return WebUtils.responseSuccess("success");
        } else {
            return WebUtils.responseError("error");
        }
    }

    @RequestMapping("addNickUser.do")//添加Nick用户
    public Object addNickUser(@RequestBody NickUser nickUser) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        nickUser.setNickRegisterTime(dateTimeFormatter.format(localDateTime));//写入注册时间
        int result = nickUserService.addNickUser(nickUser);
        if (result > 0) {
            return WebUtils.responseSuccess("success");
        } else {
            return WebUtils.responseError("error");
        }
    }

    @RequestMapping("updateNickUser.do")//修改Nick用户信息
    public Object updateNickUser(@RequestBody NickUser nickUser) {
        int result = nickUserService.updateNickUser(nickUser);
        if (result > 0) {
            return WebUtils.responseSuccess("success");
        } else {
            return WebUtils.responseError("error");
        }
    }

    @RequestMapping("deleteNickUserById.do")//删除Nick用户
    public Object deleteNickUserById(@RequestBody NickUser nickUser) {
        boolean isTrue = ImageUtils.deleteServerImageFile(nickUser.getNickImg());
        if (isTrue) {
            int result = nickUserService.deleteNickUserById(nickUser.getNickId());
            return WebUtils.responseSuccess(result);
        } else {
            return WebUtils.responseError("error");
        }
    }

    @Transactional(rollbackFor = Exception.class)
    @PostMapping("deleteNickUsers.do")//批量删除Nick用户
    public Object deleteNickUsers(@RequestBody List<NickUser> nickUsers) {
        int result = 0;
        for (NickUser nickUser : nickUsers) {
            try {
                int res = nickUserService.deleteNickUserById(nickUser.getNickId());
                if (res < 1) {
                    throw new Exception("删除失败！");
                }else{
                    result++;
                }
            } catch (Exception e) {
                e.printStackTrace();
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            }
        }
        if (result == nickUsers.size()) {
            return WebUtils.responseSuccess(result);
        } else {
            return WebUtils.responseError("error");
        }
    }
}
