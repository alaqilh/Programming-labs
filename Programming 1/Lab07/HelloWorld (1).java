import java.util.Scanner;
public class HelloWorld{

     public static void main(String []args){
         int sum = 0;
         Scanner input = new Scanner(System.in);
         
         for(int i=1;i<=6;i++){
            
       
             int a = input.nextInt();   
      
                  sum=sum+a; 
         
             System.out.println(sum); 
         }
      System.out.println("The sum is "+ sum); 
     }
}
