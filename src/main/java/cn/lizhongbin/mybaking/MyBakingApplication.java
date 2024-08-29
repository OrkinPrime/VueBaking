package cn.lizhongbin.mybaking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class MyBakingApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBakingApplication.class, args);
    }

}
