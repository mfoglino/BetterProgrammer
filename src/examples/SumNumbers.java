package examples;

import org.springframework.stereotype.Component;

@Component
public class SumNumbers {

	
	public void runTest() {
	
		int i = getSumOfNumbers("12 some text 3  7");
	}
	
	
    public static int getSumOfNumbers(String s) {
        /*
          Please implement this method to
          return the sum of all integers found in the parameter String. You can assume that
          integers are separated from other parts with one or more spaces (' ' symbol).
          For example, s="12 some text 3  7", result: 22 (12+3+7=22)
         */
    	
    	
    	String newS = s.replaceAll("[^0-9]+", " ");
    	
    	
    	String [] nums = newS.split("\\s+");
    	
    	int sum=0;
    	for (String n : nums) {
			sum+=Integer.valueOf(n);
		}
    	
    	return sum;
    	
    }
}
