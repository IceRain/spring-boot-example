package com.zzb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages={"com.zzb"}) //或用@ComponentScan，不指定扫描的路径默认扫描classpath所有
@SpringBootApplication
public class SpringBootSimpleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSimpleApplication.class, args);
	}
}
