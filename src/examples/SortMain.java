package examples;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SortMain {

	public void runTest() {

		Integer[] elems = { 2, 17,5, 15, 13, 10 };

		sortMerge(elems, 0, 5);
		int i = 0;
		
	}

	public void sortMerge(Integer[] elems, int i, int j) {
		if (i == j)
			return;

		if (i + 1 == j) {
			ordenarDos(elems, i, j);
		}
		if (j > i + 1) {
			int middle = (j+1 + i) / 2;
			sortMerge(elems, i, middle);
			sortMerge(elems, middle + 1, j);
			merge(elems, i, middle, j);
		}

	}

	private static void merge(Integer[] elems, int i, int middle, int j) {

		int originalI = i;
		List<Integer> temp = new ArrayList<Integer>();
		
		int m = middle+1;
		while (i <= middle || m <= j) {
			
			
			if (elems[i] < elems[m]) {
				temp.add(elems[i]);
				i++;
			}

			if (elems[m] < elems[i]) {
				temp.add(elems[m]);
				m++;
			}

			while (i <= middle) {
				temp.add(elems[i]);
				i++;
			}
			while (m <= j) {
				temp.add(elems[m]);
				m++;
			}
		}

		try {
			System.out.println("i,m: " + i +", "+ m);
			System.arraycopy(temp.toArray(), 0, elems, originalI, temp.toArray().length);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void ordenarDos(Integer[] elems, int i, int j) {
		if (elems[i] > elems[j]) {
			swap(elems, j, i);
		}
	}
	
	private static void sortMax(Integer[] nums)
	{
		for (int i = 0; i < nums.length; i++) {			
			
			int pos = calcularPosicionMaximoDesde(nums, i);
			swap(nums, i, pos);
			i++;
		}	
	}

	private static void swap(Integer[] nums, int i, int pos) {
		int temp = nums[pos];
		nums[pos]=nums[i];
		nums[i]=temp;
	}

	private static int calcularPosicionMaximoDesde(Integer[] nums, int i) {
		
		int max=nums[i];
		int pos = i;
		for (int j = i; j < nums.length; j++) {			
			if(nums[pos]>max)
			{
				max = nums[j];
				pos=j;
			}
		}
		return 0;
	}
}
