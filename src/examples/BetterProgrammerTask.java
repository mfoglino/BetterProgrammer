package examples;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

import org.springframework.stereotype.Component;



@Component
public class BetterProgrammerTask {

	
	public void runTest() {
		
		int a[]={66,34,23,13,7,-1};
		
		//int b[]={6,14,23,33,37,-1};
		
		
		
		int  b[] = retainPositiveNumbers(a);
		//moveTo(a, 2);
		//insertOrdered(b, 25, 1);
		
		int z =4;
		
	}
	
    public static int[] retainPositiveNumbers(int[] a) {
        /*
          Please implement this method to
          return a new array with only positive numbers from the given array.
          The elements in the resulting array shall be sorted in the ascending order.
         */
    	
    	int positives[] = new int[a.length];
    	
    	System.out.println(positives[0]);
    	
    	Integer count=0;
    	for (int elem : a) {
    		
			if(elem>0)
			{
				insertOrdered(positives, elem, count);				
				count = count.intValue()+1;
			}
		}
    	
    	return positives;
    }

	private static void insertOrdered(int[] positives, int elem, Integer count) {
		
		int i=0;
		while(elem>positives[i] && i<positives.length-1 && i<count)
		{
			i++;
			
		}
		
		moveTo(positives, i);
		positives[i]=elem;		
	}

	private static void moveTo(int[] positives, int i) {		
		
		for(int j=positives.length-1; j>i; j--)
		{
			//int temp = positives[j+1];
			positives[j]=positives[j-1];
			positives[j-1]=-1;
		}		
	}
	
	
	public static int[] retainPositiveNumbers2(int[] a) {
		
		List<Integer> list = new ArrayList<Integer>();
    	for (int elem : a) {
    		
			if(elem>0)
			{
				list.add(elem);
			}
		}
    	
    	Collections.sort(list);
    	
    	return null;
    	
    	
	}
}