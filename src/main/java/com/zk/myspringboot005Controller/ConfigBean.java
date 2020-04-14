package com.zk.myspringboot005Controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zk.service.HelloService;

/*
 * ָ����ǰ����������,�õ�ǰ�����Spring
 * �������ļ���ʹ��Bean��ǩ���������
 * */
@Configuration
public class ConfigBean {
	@Bean
	public HelloService HelloService(){
		return new HelloService();
	}
}
