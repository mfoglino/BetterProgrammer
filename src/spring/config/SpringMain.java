package spring.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import examples.BetterProgrammerTask;
import examples.RunExamplesTests;
import examples.SortMain;
import examples.SumNumbers;

public class SpringMain {


	public static void main(String[] args) {
	
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				AppConfig.class);

		
		RunExamplesTests tests = ctx.getBean(RunExamplesTests.class);
		SortMain sort = ctx.getBean(SortMain.class);
		SumNumbers sumNumbers = ctx.getBean(SumNumbers.class);
		//BetterProgrammerTask betterProgrammerTask = ctx.getBean(BetterProgrammerTask.class);
				
		tests.runTest();
		sort.runTest();
		sumNumbers.runTest();
		//betterProgrammerTask.runTest();
		
	}

}
