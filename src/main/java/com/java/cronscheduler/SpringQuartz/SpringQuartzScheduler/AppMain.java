package com.java.cronscheduler.SpringQuartz.SpringQuartzScheduler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("quartz-context.xml");
		
		//ApplicationContext context = new FileSystemXmlApplicationContext("/resoures/quartz-context.xml");
		
																		   
	}

}
