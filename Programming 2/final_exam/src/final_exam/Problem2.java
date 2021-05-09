package final_exam;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter The Base :  ");
		 
		 int a = input.nextInt();
		 
		 System.out.println("Enter The Exponent :  ");
		 
		 int x = input.nextInt();
		 
        System.out.print("The Power Of An Integer " + a + "^" + x + " Is  " + power(a, x));

	}
	
	public static int power(int base, int exponent ) {
		
		if (exponent != 0) {

		      return (base * power(base, exponent - 1));
		    }
		    else {
		      return 1;
		
	}

}
	
}