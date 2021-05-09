public class HelloWorld{

     public static void main(String []args){
         int i = 1,j;
         while(i<=3){
            System.out.println(i); 
            j=1;
            while(j<=2){
            System.out.println("i = "+i+";j = "+j); 
             j++;   
            }
            i++;
         }
        System.out.println("Hello World");
     }
}
