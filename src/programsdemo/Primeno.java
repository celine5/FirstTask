package programsdemo;
//the number can be greater than 1
//which has 2 factors 1 & itself;
//import java.util.Scanner;

public class Primeno {
    public static void main(String... args) {

      //  Scanner sc = new Scanner(System.in);
      //    System.out.println("enter the num");
        int n=0;
     //   int n = sc.nextInt();
        int count = 0;
        if (n > 1) {
            for (int i = 1; i<=n;i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count ==2) {
                System.out.println("its a prime num");
            } else
                System.out.println("its not a prime num");
        }
        else
            System.out.println("its not a perfect prime num");


    }

}