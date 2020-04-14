package com.zk.myspringboot005Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
@SpringBootApplication
//@ImportResource(locations={"classpath:beans.xml"})
//@ImportResource：导入spring配置文件让配置文件的内容生效
public class SpringBootApp{

	public static void main(String[]args){
		SpringApplication.run(SpringBootApp.class, args);
	}
}
