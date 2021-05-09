import java.util.Scanner;
public class maxno{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the first number");
    int number;
    number = input.nextInt();
    int max = number; 
    int i=1;
    while(i<6){
    System.out.println("Enter the next number");
    number = input.nextInt();
    if(number > max){
     max = number;
     }
     i++;
     }
     System.out.println("The largest number is "+max);
    
}
        
    }
