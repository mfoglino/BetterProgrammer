package examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RunExamplesTests {

	@Autowired
	private Matriz matriz;
	
	private BetterProgrammerTask betterProgrammerTask;
	
	@Autowired
	private SortMain sort;
	
	@Autowired
	private SumNumbers sumNumbers; 
	
	public BetterProgrammerTask getBetterProgrammerTask() {
		return betterProgrammerTask;
	}

	@Autowired
	public void setBetterProgrammerTask(BetterProgrammerTask betterProgrammerTask) {
		this.betterProgrammerTask = betterProgrammerTask;
	}

	public void runTest()
	{		
		matriz.runTest();
		betterProgrammerTask.runTest();
		sort.runTest();
		sumNumbers.runTest();
	}
}
