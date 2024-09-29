package com.uploader.app;

import com.uploader.app.service.FilesStorageService;
import jakarta.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UploaderApiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(UploaderApiApplication.class, args);
    }


    @Resource
    FilesStorageService storageService;

    @Override
    public void run(String... arg) throws Exception {
//    storageService.deleteAll();
        storageService.init();
    }
}
