package com.micheal.itoken.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author <a href="mailto:wangmk13@163.com">micheal.wang</a>
 * @date 2020/11/2 15:39
 * @Description 分布式配置中心
 * 具体配置存放 gitee https://gitee.com/michealwong/spring-cloud-config.git
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}
