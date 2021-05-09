import java.util.Scanner;
public class GuessingNo{

     public static void main(String []args){
         Scanner input = new Scanner(System.in);
        int no = (int)(Math.random() *101);
        System.out.println("Guess a magic number between 0 and 100 ");
        int g = -1;
        while(g!=no){
        System.out.println("Enter your guess: ");
        int u = input.nextInt();
        if(u==no)
        System.out.println("Yes, the number is " + no);
        else if (u>no)
        System.out.println("Your guess is too high " + no);
        else
        System.out.println("Your guess is too low " + no);
            
            
        }
     }
}
