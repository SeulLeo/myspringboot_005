package com.zk.myspringboottest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.zk.myspringboot005Controller.SpringBootApp;
import com.zk.service.HelloService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={SpringBootApp.class})
public class SpringBoottest {
	
	@Autowired
	private ConfigurableApplicationContext ioc;
	
	HelloService helloservice;
	
	@Autowired
    private ApplicationContext ac;
	
	
	@Test
	public void testHelloService(){
		System.out.println(ioc.containsBean("HelloService"));
		helloservice.sayHello();
		boolean flag=ac.containsBean("HelloService");
		System.out.println(flag);
	}
	
}
