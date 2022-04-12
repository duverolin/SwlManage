package com.duverolin.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class ImageUtils {
    //头像图片保存路径
    static final String ImagePath = "C:\\Users\\duverolin\\Documents\\HBuilderProjects\\SwlManage\\public\\assets\\upload\\";


    public static String formatDate() {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("_yyyy_MM_dd_HH_mm_ss.");
        return dateTimeFormatter.format(dateTime);
    }

    //保存头像到服务器文件夹中
    public static Object saveImage(MultipartFile multipartFile) throws Exception {
        if (!multipartFile.isEmpty()) {
            String beforeFileName = multipartFile.getOriginalFilename();
            String afterFileName = UUID.randomUUID() + formatDate() + beforeFileName.split("\\.")[1];
            File file = new File(ImagePath, afterFileName);
            if (file.exists()) {
                afterFileName = UUID.randomUUID() + formatDate() + beforeFileName.split("\\.")[1];
                file = new File(ImagePath, afterFileName);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            bufferedOutputStream.write(multipartFile.getBytes());
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            return WebUtils.responseSuccess(afterFileName);
        } else {
            return WebUtils.responseError("error");
        }
    }

    //删除服务器中图片
    public static boolean deleteServerImageFile(String nickImg) {
        if (nickImg != null && !nickImg.equals("")) {
            File file = new File(ImagePath, nickImg);
            boolean isTrue = false;
            if (file.exists()) {
               isTrue = file.delete();
            }
            return isTrue;
        }else {
            return true;
        }
    }
}
