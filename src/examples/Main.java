package examples;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		int positives[] = new int[10];
    	
    	System.out.println(positives[1]);
    	
    	System.out.println(reverseWords("Hello world"));
    	
	}
	
	
	
    public static Set<Object> getIntersection(Set<Object> a, Set<Object> b) {
        /*
          Please implement this method to
          return a Set equal to the intersection of the parameter Sets
          The method should not chage the content of the parameters.
         */
    	
    	Set<Object> intersec = new HashSet<Object>();    	
    	
    	for (Object item : a) {			
    		if(b.contains(item))
    		{
    			intersec.add(item);    			
    		}
		}    	
    	
    	return intersec;
    }
    
    
    
    // Please do not change this interface
    public static interface Node {
        int getValue();
        List<Node> getChildren();
    }


    public static List<Node> traverseTreeInDepth(Node root) {
        /*
          Please implement this method to
          traverse the tree in depth and return a list of all passed nodes.

          The method shall work optimally with large trees.
         */
    	
    	
    	List<Node> resu = new ArrayList<Node>();
    	
    	
    	
    	for (Node node : resu) {
			
		}
    	
    	return null;
    }
    
    
    public static int countWaysToProduceGivenAmountOfMoney(int cents) {
        /*
          Please implement this method to
          return the number of different combinations of US coins
          (penny: 1c, nickel: 5c, dime: 10c, quarter: 25c, half-dollar: 50c)
          which may be used to produce a given amount of money.

          For example, 11 cents can be produced with
          one 10-cent coin and one 1-cent coin,
          two 5-cent coins and one 1-cent coin,
          one 5-cent coin and six 1-cent coins,
          or eleven 1-cent coins.
          So there are four unique ways to produce 11 cents.
          Assume that the cents parameter is always positive.
         */
    	return 0;
    }
    
    
    public static String reverseWords(String s) {
        /*
          Assume that the parameter String can only contain spaces and alphanumeric characters.
          Please implement this method to
          reverse each word in the original String while maintaining the word order.
          For example:
          parameter: "Hello world", result: "olleH dlrow"
         */
    	
    	String [] words = s.split("\\s+");
    	
    	String reversed = "";
    	for (int i = 0; i < words.length-1; i++) {
			reversed += reverseWord(words[i]) + " ";
		}    	
    	reversed += reverseWord(words[words.length-1]);
    	
    	return reversed;
    }
    
    private static String reverseWord(String s)
    {
    	String resu = "";
    	for (int i = 0; i < s.length(); i++) {
			resu = s.charAt(i) + resu;
		}
    	
    	   	
    	return resu;
    }
}

