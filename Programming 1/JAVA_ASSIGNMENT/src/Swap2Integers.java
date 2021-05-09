/*
 * Write a program called Swap2Integers that prompts user for two integers. The program shall read the inputs 
 * as int, save in two variables called number1 and number2; swap the contents of the two variables; and print the 
 * results. For examples,
Enter first integer: 9
Enter second integer: -9
After the swap, first integer is: -9, second integer is: 9
 */
import java.util.Scanner;
public class Swap2Integers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter first integer:");
		int a = input.nextInt();
		System.out.println("Enter second integer:");
		int b = input.nextInt();
		System.out.println("After the swap:");
		int c = a;
		a = b;
		b = a;
		System.out.println("First integer is:" + a);
		System.out.println("Second integer is:" + b);

	}

}
