package cn.lizhongbin.mybaking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


//Spring两大特性：控制反转，面向切面编程
@SpringBootApplication
public class MyBakingApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBakingApplication.class, args);
    }

}
