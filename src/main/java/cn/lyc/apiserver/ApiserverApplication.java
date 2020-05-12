package cn.lyc.apiserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"cn.lyc.dao"})
public class ApiserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiserverApplication.class, args);
    }

}
