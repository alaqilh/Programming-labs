import java.util.Scanner;
public class Ex1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double[] gpa = new double[5];
        String[]name = new String[5];
        for(int i=0;i<=5;i++){
           System.out.println("Enter the name:" );
           name[i]=input.next();
           System.out.println("Enter the GPA:" );
          //double[] gpa=null;
          gpa[i]=input.nextDouble();
        }
           
        

    }
}
