package com.zxing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 该项目用来测试使用zxing 生成、扫描等常见的一维码/二维码的操作
 */
@SpringBootApplication
public class ZxingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZxingApplication.class, args);
    }
}
