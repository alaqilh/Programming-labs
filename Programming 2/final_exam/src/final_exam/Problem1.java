
package final_exam;
import java.util.*;


public class Problem1 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> rainbow = new TreeMap<Integer, String>();  
		
		rainbow.put(1, "Purple");    
		rainbow.put(2, "Navy");    
		rainbow.put(3, "Blue");    
		rainbow.put(4, "Green");    
		rainbow.put(5, "Yellow");    
		rainbow.put(6, "Orange");    
		rainbow.put(7, "Red");   
		
		

		int a = 0;	
		
		for(a=3; a<=6; ++a)
        {
			  System.out.println(rainbow.get(a)); 
        }
		
		

	}

}
