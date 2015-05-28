package com.xinglongjian.flow.handler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HellowordMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		HellowordTest ht=(HellowordTest) ac.getBean("helloWorld");
		System.out.println(ht.getMessage());
	}

}
