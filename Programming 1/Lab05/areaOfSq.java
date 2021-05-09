import java.util.Scanner;
public class areaOfSq{

     public static void main(String []args){
         int area, Side ;
         Scanner input = new Scanner(System.in);
         Side = input.nextInt();
        // breadth = input.nextInt();
         area =Side * Side;
        System.out.println("Area of the Square is  "  +area);
     }
}
