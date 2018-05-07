package com.wuxinvip.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *	开启 feign 用来声明式调用其他服务@EnableFeignClients
 *	标记eureka 客户端@EnableEurekaClient
 *	开启 注册发现 以便获得服务发现能力@EnableDiscoveryClient
 *	开启熔断@EnableHystrix
 *
 *
 */
@EnableFeignClients
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix
@Configuration
@MapperScan("com.wuxinvip.project.mapper")
@ComponentScan(basePackages = {
		"com.wuxinvip.project.*"
})
@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}
}
