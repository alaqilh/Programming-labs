/*
 * Write a program called Cylinder Computation that prompts user for the base radius and height of a cylinder in 
 * floating point number. The program shall read the inputs as double; compute the base area, surface area, 
 * and volume of the cylinder; and print the values rounded to 2 decimal places. 
The formulas are:
baseArea = Math.PI * radius * radius;
surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
volume = baseArea * height;
 */
import java.util.Scanner;
public class CylinderComputation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double radius = input.nextDouble();
		System.out.println("Enter the height: ");
		double height = input.nextDouble();
		double baseArea = Math.PI * radius * radius;
		double surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
		double volume = baseArea * height;
		System.out.println("The base area of the cylinder is: " + Math.round(baseArea*100.00)/100.00);
		System.out.println("The surface area of the cylinder is: " + Math.round(surfaceArea*100.00)/100.00);
		System.out.println("The volume of the cylinder is: " + Math.round(volume*100.00)/100.00);
	}

}
