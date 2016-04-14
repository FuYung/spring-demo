package cn.dreamfy.example.ch01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * JobLaunchTest
 * Created by vicfu on 2016/4/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/ch01/jobs/job.xml"})
public class JobLaunchTest {

	@Autowired
	private JobLauncher jobLauncher;

	@Autowired
	@Qualifier("billJob")
	private Job job;

	@Test
	public void importProducts() throws JobParametersInvalidException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
		JobExecution jobExecution = jobLauncher.run(job, new JobParametersBuilder().addString("date", "2016-01-03").toJobParameters());
		System.out.println("status : " + jobExecution.toString());
	}
}
