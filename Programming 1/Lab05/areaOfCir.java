import java.util.Scanner;
public class areaOfCir{

     public static void main(String []args){
         double area, Radius ;
         Scanner input = new Scanner(System.in);
         Radius = input.nextInt();
      
         area =Radius * Radius * 3.14159;
        System.out.println("The area of the Circle of radius" +Radius +" is " +area);
     }
}

