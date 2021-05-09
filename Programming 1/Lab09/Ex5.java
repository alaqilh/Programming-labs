import java.util.Scanner;
public class Ex5 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        for(int i=0;i<numbers.length;i++){
        numbers[i]=input.nextInt();
        }
        int max=numbers[0];
         for(int i=0;i<numbers.length;i++){
         if (numbers[i]>max){
             max=numbers[i];
         }
        }
          System.out.println("The maximum number of the array is  " + max);

        }
           
        

    }
