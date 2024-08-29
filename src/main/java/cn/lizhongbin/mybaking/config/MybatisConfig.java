package cn.lizhongbin.mybaking.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
//表明配置类
@Configuration
@MapperScan("cn.lizhongbin.mybaking.mapper")
public class MybatisConfig {
}
