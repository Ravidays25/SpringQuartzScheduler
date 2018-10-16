package com.java.cronscheduler.SpringQuartz.SpringQuartzScheduler;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class ScheduledJob  extends QuartzJobBean{
	private AnotherBean anotherBean; 
    
    protected void executeInternal(JobExecutionContext arg0)
            throws JobExecutionException {
        anotherBean.printAnotherMessage();
    }
 
    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

}
