package com.hz.huitingweb.wx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients
@SpringBootApplication
@ComponentScan({"com.hz.huitingweb.common","com.hz.huitingweb.wx","com.hz.huitingweb.data"})
public class WxApplication {

	public static void main(String[] args) {
		SpringApplication.run(WxApplication.class, args);
	}
}
