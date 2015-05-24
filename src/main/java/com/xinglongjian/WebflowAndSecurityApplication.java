package com.xinglongjian;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EntityScan(basePackages="com.xinglongjian.domain")
@EnableJpaRepositories(basePackages="com.xinglongjian.repository")
public class WebflowAndSecurityApplication {
	private static final Logger log = LoggerFactory.getLogger(WebflowAndSecurityApplication.class);
	
	@Component
	static class Runner implements CommandLineRunner {
	
		@Override
		public void run(String... args) throws Exception {
			// TODO Auto-generated method stub
			log.info("command................");
		}
	}
	
	public static void main(String[] args) {
        SpringApplication.run(WebflowAndSecurityApplication.class, args);
    }
}
