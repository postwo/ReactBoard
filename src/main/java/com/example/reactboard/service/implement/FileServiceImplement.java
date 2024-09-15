package com.example.reactboard.service.implement;

import com.example.reactboard.service.FileService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@Service
public class FileServiceImplement implements FileService {//impl 은 인터페이스 구현체를 의미한다

    @Value("${spring.file.path}")
    private String filePath;
    @Value("${spring.file.url}")
    private String fileUrl;


    @Override
    public String upload(MultipartFile file) {// 사진 저장
        if(file.isEmpty()) return null;

        String originFileName = file.getOriginalFilename();
        String extension = originFileName.substring(originFileName.lastIndexOf("."));
        String uuid = UUID.randomUUID().toString();
        String saveFileName = uuid+ extension;
        String savePath = filePath + saveFileName;

        try{
            file.transferTo(new File(savePath));
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

        String url = fileUrl + saveFileName;
        return url;
    }

    //이미지를 받아온다
    @Override
    public Resource getImage(String fileName) {

        Resource resource = null;

        try{
            resource = new UrlResource("file:" + filePath + fileName);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return resource;
    }



}
