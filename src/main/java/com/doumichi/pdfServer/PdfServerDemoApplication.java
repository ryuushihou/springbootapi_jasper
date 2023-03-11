package com.doumichi.pdfServer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.doumichi.pdfServer.mapper")
public class PdfServerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PdfServerDemoApplication.class, args);
    }

}
