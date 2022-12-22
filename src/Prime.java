import java.util.Scanner;

public class Prime {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int no = sc.nextInt();
        int count = 0;
        if (no > 1) {
            for (int i = 1; i <= no; i++) {
                if (no % i == 0)
                    count++;
            }
            if (count == 2) {
                System.out.println("its a prime num");
            } else {
                System.out.println("its not a prime num");
            }
        }
        System.out.println("its not a prime number");
    }
}

