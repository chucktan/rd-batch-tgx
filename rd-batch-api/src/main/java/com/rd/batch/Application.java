package com.rd.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author
 * @create 2020-09-09-14:30
 */

@SpringBootApplication
//扫描mybatis 通用mapper所在的包
@MapperScan(basePackages = "com.rd.batch.mapper")
//扫描所有包及相关组件
@ComponentScan({"com.rd","org.n3r.idworker"})

//开启定时任务
@EnableScheduling

public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}

