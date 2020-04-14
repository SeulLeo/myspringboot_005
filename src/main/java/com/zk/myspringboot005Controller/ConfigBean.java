package com.zk.myspringboot005Controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zk.service.HelloService;

/*
 * 指明当前类是配置类,用当前类代替Spring
 * 在配置文件中使用Bean标签增加组件。
 * */
@Configuration
public class ConfigBean {
	@Bean
	public HelloService HelloService(){
		return new HelloService();
	}
}
