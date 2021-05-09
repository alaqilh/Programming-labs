/*
 Write a program called PrintNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER" 
 if the int variable "number" is 1, 2,... , 9, or other, respectively.
 Use (a) a "nested-if" statement; 
*/
import java.util.Scanner;

public class PrintNumberInWord {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter The Number(1-9): ");
		int x = a.nextInt();
		if(x<=9) {
			if(x==1) {
				System.out.println("One");
			}
			else if(x==2) {
				System.out.println("Two");
			}
			else if(x==3) {
				System.out.println("Three");
			}
			else if(x==4) {
				System.out.println("Four");
			}
			else if(x==5) {
				System.out.println("Five");
			}
			else if(x==6) {
				System.out.println("Six");
			}
			else if(x==7) {
				System.out.println("Seven");
			}
			else if(x==8) {
				System.out.println("Eight");
			}
			else {
				System.out.println("Nine");
			}
			}
		else {
			System.out.println("Other");
		}
		}
		
		

	}


