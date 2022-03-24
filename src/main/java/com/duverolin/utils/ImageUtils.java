package com.duverolin.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class ImageUtils {
    //头像图片保存路径
    static final String ImagePath = "C:\\Users\\duverolin\\Documents\\HBuilderProjects\\SwlManage\\public\\assets\\upload\\";


    public static String formatDate(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("_yyyy_MM_dd_HH_mm_ss.");
        return simpleDateFormat.format(date);
    }
    //保存头像
    public static Object saveImage(MultipartFile multipartFile) throws Exception {
        if (!multipartFile.isEmpty()) {
            Date date = new Date();
            String fileName = multipartFile.getOriginalFilename();
            fileName = UUID.randomUUID() + formatDate(date) + fileName.split("\\.")[1];
            File file = new File(ImagePath, fileName);
            if (file.exists()){
                String reFileName = UUID.randomUUID() + formatDate(date) + multipartFile.getOriginalFilename().split("\\.")[1];
                file = new File(ImagePath, reFileName);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            bufferedOutputStream.write(multipartFile.getBytes());
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            return WebUtils.responseSuccess(fileName);
        } else {
            return WebUtils.responseError("error");
        }
    }

}
