package com.technoSofTeam.best.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main Class in charge of Batch Launch
 *
 * @author meyacine
 */
public class BatchLauncher {

    public static void main(String[] args) {
        String[] springConfig = {"database.xml",
                    "bestBatchContext.xml",
                    "com/technoSofTeam/best/batch/jobCsvToMySqlContext.xml"
                };
        // we start by loading our batch context
        ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
        Job job = (Job) context.getBean("bestReportCsvToMySqlJob");
        try {
            JobExecution execution = jobLauncher.run(job, new JobParameters());
            System.out.println("Exit Status : " + execution.getStatus());
        } catch (JobExecutionAlreadyRunningException | JobRestartException | JobInstanceAlreadyCompleteException | JobParametersInvalidException e) {
        }
        System.out.println("Done");
    }
}
