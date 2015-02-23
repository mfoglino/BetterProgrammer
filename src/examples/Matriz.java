package examples;
import java.util.Comparator;

import org.springframework.stereotype.Component;

@Component
public class Matriz {
	
	public void runTest() {
		
		
//		List<Integer> numbers = new ArrayList<Integer>();
//		numbers.add(1);
//		numbers.add(10);
//		numbers.add(5);
//		numbers.add(3);
//		
//		Collections.sort(numbers);
//		System.out.println(numbers.toString());
//		
//		Collections.sort(numbers, new Alvesre());		
//		System.out.println(numbers.toString());
//		
//		
//		Map<String, String> map = new TreeMap<String, String>();
		
		
		char[][] matriz = {{'a','b','c','d'},{'a','h','o','x'},{'a','z','l','x'},{'a','s','a','x'}};
		
		System.out.println(isTherePath(matriz, 1, 1, "hola", 4, 4));
	}
	
	
	
	public boolean isTherePath(char [][] matriz, int i, int j, String s, int n, int m)
	{
		boolean result = false;
		
		if(s.isEmpty()) return true;
		
		
		System.out.println(i + ", " + j + ", " +s);
		
		result = matriz[i][j]==s.charAt(0);
		result = result && (
				(isInRange(i,j+1, n, m) && isTherePath(matriz, i, j+1, s.substring(1), n, m)) ||
				(isInRange(i,j-1, n, m) && isTherePath(matriz, i, j-1, s.substring(1), n, m)) ||
				(isInRange(i+1,j, n, m) && isTherePath(matriz, i+1, j, s.substring(1), n, m)) ||
				(isInRange(i-1,j, n, m) && isTherePath(matriz, i-1, j, s.substring(1), n, m)) 
				);
		
		return result;
	}
	
	
	
	
	private boolean isInRange(int i, int j, int n, int m) {
		
		if(i<0 || j < 0)
			return false;
		if(i>n || j > m)
			return false;
		
		return true;
	}




	public class Alvesre implements Comparator<Integer>
	{
		@Override
		public int compare(Integer o1, Integer o2) {
			// 
			return o1.compareTo(o2) * -1;
		}		
	}
}
