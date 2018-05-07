package com.wuxinvip.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ServiceTrackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceTrackApplication.class, args);
	}


}
