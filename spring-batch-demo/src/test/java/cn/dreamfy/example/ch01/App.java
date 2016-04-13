package cn.dreamfy.example.ch01;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * App
 * Created by vicfu on 2015/12/30.
 */
public class App {
	public static void main(String[] args) {
		String[] springConfig = {
				"ch01/jobs/job.xml"
		};

		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("billJob");
		try {
			JobExecution execution = jobLauncher.run(job, new JobParameters());
			System.out.println("Exit Status : " + execution.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Done...");
	}
}
