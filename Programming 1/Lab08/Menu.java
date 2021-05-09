import java.util.Scanner;
public class Menu{

     public static void main(String []args){
         Scanner a = new Scanner(System.in);
        int choose =0;  
        double price =0; 
        System.out.println("Welcome to CS111 Restaurant"+ "Please choose from the following menu:");
        System.out.println("1- Orange Juice (5 SR)");
        System.out.println("2- Apple Juice (3 SR)");
        System.out.println("3- Sandwich (10 SR)");
        System.out.println("4- Pizza (15 SR)");
        System.out.println("5- Pasta (20 SR)");
        System.out.println("6- Exit");
        
        do{
            choose = a.nextInt();
            switch(choose){
                case 1 :{
                    price+=5;
                    break;
                }
                 case 2 :{
                    price+=3;
                    break;
                }
                 case 3 :{
                    price+=10;
                    break;
                }
                 case 4 :{
                    price+=15;
                    break;
                }
                 case 5 :{
                    price+=20;
                    break;
                }
                 case 6 :{
                    break;
                }
                 default :{
                   System.out.println("Error ... Please enter a valid choice!");
                }
            }
              
            } while(choose != 6); 
            System.out.println( "The total price of your order" + price );   
        }   
     }
