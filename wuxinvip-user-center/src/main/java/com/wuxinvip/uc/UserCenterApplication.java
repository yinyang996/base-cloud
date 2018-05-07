package com.wuxinvip.uc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration//开启远程配置
@EnableFeignClients//开启 feign
@EnableEurekaClient//标记eureka 客户端
@EnableDiscoveryClient//开启 注册发现 以便获得服务发现能力
@EnableHystrix//开启熔断
@EnableCircuitBreaker //开启服务监控
@MapperScan("com.wuxinvip.uc.mapper")
@ComponentScan(basePackages = {
		"com.wuxinvip.uc.*"
})
@SpringBootApplication
public class UserCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserCenterApplication.class, args);
	}
}
