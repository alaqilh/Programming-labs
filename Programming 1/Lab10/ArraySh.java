public class ArraySh{

     public static void main(String []args){
         double[] temp= myList[0];
         for(int i=1;i<myList.length;i++){
             myList[i-1]=myList[i];
         }
         myList[myList.length-1]=temp;
     }
       
}
