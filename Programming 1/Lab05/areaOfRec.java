import java.util.Scanner;
public class areaOfRec{

     public static void main(String []args){
         int area, length, breadth ;
         Scanner input = new Scanner(System.in);
         length = input.nextInt();
         breadth = input.nextInt();
         area =length * breadth;
        System.out.println("Area of the Rectangle  "  +area);
     }
}
