/*
 Write a program called SumProductMinMax3 that prompts user for three integers. The program shall read the inputs as int;
 compute the sum, product, minimum and maximum of the three integers; and print the results. For examples,
            Enter 1st integer: 8
            Enter 2nd integer: 2
            Enter 3rd integer: 9
            The sum is: 19
            The product is: 144
            The min is: 2
            The max is: 9

 */
import java.util.Scanner;

public class SumProductMinMax3 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter 1st integer: ");
		int b = a.nextInt();
		System.out.println("Enter 2nd integer: ");
		int c = a.nextInt();
		System.out.println("Enter 3rd integer: ");
		int d = a.nextInt();
		
		System.out.println("The sum is: " + (b+c+d));
		System.out.println("The product is: " + (b*c*d));
		System.out.println("The min is: " + Math.min(b,Math.min(c, d)));
		System.out.println("The max is: " + Math.max(b,Math.max(c, d)));
		
	}

}
