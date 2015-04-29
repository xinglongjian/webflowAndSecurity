package com.xinglongjian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages="com.xinglongjian.domain")
@EnableJpaRepositories(basePackages="com.xinglongjian.repository")
public class WebflowAndSecurityApplication {


	public static void main(String[] args) {
        SpringApplication.run(WebflowAndSecurityApplication.class, args);
    }
}
