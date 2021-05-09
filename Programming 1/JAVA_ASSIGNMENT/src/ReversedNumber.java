/*
 * Write a program that prompts user for a positive integer. The program shall read the input as 
 * int; and print the "reverse" of the input integer. For examples,
Enter a positive integer: 12345
The reverse is: 54321

 */
import java.util.Scanner;
public class ReversedNumber {

	public static void main(String[] args) {
		int num = 0;
		int reverse = 0;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a positive integer: ");
		num = input.nextInt();
		while(num!=0) {
			reverse = reverse * 10;
			reverse = reverse + num % 10;
			num = num / 10;
			
		}
		
		System.out.println("The reverse is: " + reverse);

	}

}
