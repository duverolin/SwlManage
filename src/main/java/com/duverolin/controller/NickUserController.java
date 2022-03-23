package com.duverolin.controller;

import com.duverolin.entity.NickUser;
import com.duverolin.services.NickUserService;
import com.duverolin.utils.ImageUtils;
import com.duverolin.utils.WebUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/")
public class NickUserController {
    final Map<String, Object> map = new HashMap<>();

    private NickUserService nickUserService;

    @Autowired//使用Set方法自动注入nickUserService
    public void setNickUserService(NickUserService nickUserService) {
        this.nickUserService = nickUserService;
    }

    @RequestMapping("selectAllnickUsers.do")//分页查询所有NickUser
    public Object selectAllnickUsers(HttpServletRequest request) {
        //读取request中传过来的参数的值
        int pageNum = Integer.parseInt(request.getParameter("pageNum"));
        int pageSize = Integer.parseInt(request.getParameter("pageSize"));
        PageHelper.startPage(pageNum, pageSize);//开启分页插件并指定第几页（pageNum），按多少条数据（pageSize）
        try {
            List<NickUser> nickUserList = nickUserService.selectAllnickUsers();//执行查询所有NickUser
            PageInfo<NickUser> pageInfo = new PageInfo<>(nickUserList);//查询出来的结果用PageInfo类封装
            if (pageInfo.getList() != null) {//判断查询出来的nickUserList有没有值
                return WebUtils.responseSuccess(pageInfo);//返回pageInfo对象
            } else {
                return WebUtils.responseError("error");
            }
        } finally {
            PageHelper.clearPage();
        }
    }

    @RequestMapping("uploadImage.do")//上传保存Nick用户头像
    public Object uploadImage(@RequestParam("file") MultipartFile multipartFile) throws Exception {
        //return WebUtils.responseSuccess("success");
        return ImageUtils.saveImage(multipartFile);
    }
}
