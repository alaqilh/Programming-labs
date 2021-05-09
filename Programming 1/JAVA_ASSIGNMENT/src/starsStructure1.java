/*
 Print following structure in Java using loops?
*
***
*****
***
*
 */
public class starsStructure1 {

	public static void main(String[] args) {
		
			int a = 3, b, c, s = 1;
			s = a - 1;
			for(c = 1; c <= a; c++) {
				
				for(b = 1; b <= s; b++) {
					
					System.out.print(" ");
				}
				s--;
				for(b = 1; b <= 2 * c - 1; b++) {
					
					System.out.print(" * ");
				}
				
					System.out.println(" ");
				
			}
			
			s = 1;
			
			for(b = 1; b <= a - 1; b++) {
				
				for(b = 1; b <= s; b++) {
					
					System.out.print(" * ");
				}
				s++;
				
				for(b = 1; b <= 2 * (a - c) - 1; b++) {
					
					System.out.print(" * ");
				}
				System.out.println(" ");
			}
			

	}

}
