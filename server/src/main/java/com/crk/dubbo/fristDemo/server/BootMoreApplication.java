package com.crk.dubbo.fristDemo.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author: 程荣凯
 * @Date: 2019/5/13 21:48
 * @Description:
 */
@SpringBootApplication
@ImportResource(value = {"classpath:spring/spring-jdbc.xml","classpath:spring/spring-dubbo.xml"})
//@MapperScan(basePackages = "com.crk.dubbo.fristDemo.model.mapper")
public class BootMoreApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BootMoreApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(BootMoreApplication.class, args);
    }
}
