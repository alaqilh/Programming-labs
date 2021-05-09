public class CopyingArray {

     public static void main(String []args){
         int[]a={2,3,1,5,10};
         int[]s=new int[a.length];
         System.arraycopy(a,0,s,0,a.length);
        System.out.println("The value of the second array is: ");
        for(int i=0;i<a.length;i++){
        System.out.println(s[i]+" ");  
        }
     }
}
