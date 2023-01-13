package programsdemo;
import java.util.Arrays;
import java.util.Scanner;


public class SortedDemo {
    public static void main(String... args) {

        System.out.println("enter the numbers");
        Scanner sc = new Scanner(System.in);
        int a[]=new int[5];
        int i=0;
        int temp=0;
        for(i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
       for(i=0;i<a.length-1;i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
      //inbuild sorted function
        // Arrays.sort(a);
            for(int k:a) {
                System.out.println(k);
            }

    }
}
