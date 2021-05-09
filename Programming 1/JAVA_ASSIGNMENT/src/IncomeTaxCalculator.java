/*
 * The progressive income tax rate is mandated as follows:
Taxable Income	Rate (%)
First $20,000	0
Next $20,000	10
Next $20,000	20
The remaining	30
For example, suppose that the taxable income is $85000, the income tax payable is $20000*0% + $20000*10% + $20000*20% + $25000*30%.

Write a program called IncomeTaxCalculator that reads the taxable income (in int). The program shall calculate the income tax payable 
(in double); 
and print the result rounded to 2 decimal places. For examples,

Enter the taxable income: $41234
The income tax payable is: $2246.80

Enter the taxable income: $67891

The income tax payable is: $8367.30

Enter the taxable income: $85432

The income tax payable is: $13629.60

Enter the taxable income: $12345
The income tax payable is: $0.00

 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class IncomeTaxCalculator {
	private static DecimalFormat a = new DecimalFormat("0.00");
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the taxable income:");
		
		int income = input.nextInt();
		double tax = 0, sum = 0;
		if(income <= 20000) {
			tax = income * 0;
			sum = tax + income;
		}
		else if(income > 20000 && income <= 40000) {
			tax = income * 0.10;
			sum = tax + income;
		}
		else if(income > 40000 && income <= 60000) {
			tax = income * 0.20;
			sum = tax + income;
		}
		else{
			tax = income *0.30;
			sum = tax + income;
		}
		System.out.print("The income tax payable is: " + a.format(sum) + "$");
		
		
		

	}

}
