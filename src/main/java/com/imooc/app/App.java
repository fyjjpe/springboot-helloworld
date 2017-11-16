package com.imooc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//第一种启动注解：
//@SpringBootApplication(scanBasePackages ="com.imooc.controller" )

//第二种启动注解：
@ComponentScan(basePackages = "com.imooc.controller")
@EnableAutoConfiguration
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
