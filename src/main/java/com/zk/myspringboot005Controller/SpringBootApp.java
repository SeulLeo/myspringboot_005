package com.zk.myspringboot005Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
@SpringBootApplication
//@ImportResource(locations={"classpath:beans.xml"})
//@ImportResource������spring�����ļ��������ļ���������Ч
public class SpringBootApp{

	public static void main(String[]args){
		SpringApplication.run(SpringBootApp.class, args);
	}
}
