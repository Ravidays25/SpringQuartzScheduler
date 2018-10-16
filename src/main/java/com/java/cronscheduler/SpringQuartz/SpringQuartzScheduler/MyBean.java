package com.java.cronscheduler.SpringQuartz.SpringQuartzScheduler;
import java.io.IOException;

import org.springframework.stereotype.Component;
@Component("myBean")
public class MyBean {

	
	  public void printMessage() throws IOException {
	        System.out.println("I am called by MethodInvokingJobDetailFactoryBean using SimpleTriggerFactoryBean");
	       //Runtime.getRuntime().exec("sh ./sample.sh");
	       
	       
	  }
	
	
}
