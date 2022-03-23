package com.duverolin.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class ImageUtils {
    static final String ImagePath = "C:\\Users\\duverolin\\Documents\\HBuilderProjects\\SwlManage\\public\\assets\\upload\\";

    public static String formatDate(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("_yyyy_MM_dd_HH_mm_ss.");
        return simpleDateFormat.format(date);
    }

    public static Object saveImage(MultipartFile multipartFile) throws Exception {
        if (!multipartFile.isEmpty()) {
            String fileName = multipartFile.getOriginalFilename();
            Date date = new Date();
            fileName = UUID.randomUUID() +formatDate(date)+fileName.split("\\.")[1];
            File file = new File(ImagePath, fileName);
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

    // 文件删除
    public static boolean removeFile(String filePath) {
        File file = new File(filePath);
        return file.delete();
    }
}
