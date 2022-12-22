import java.util.Scanner;
public class ArrayDemo {
    public static void main(String... args){
        int[] a=new int[6];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the arraylist");
         for(int i=1;i<a.length;i++)
             a[i]=sc.nextInt();

         for(int i=1;i<a.length;i++){
             System.out.println(a[i]);
         }
    }
}
