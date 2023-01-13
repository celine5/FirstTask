package programsdemo;
import java.util.Scanner;
public class Primeno {
    public static void main(String... args) {
        System.out.println("enter the num");
        Scanner sc = new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        for(int k:a){
            System.out.println(k);

        }
    }
}



