import java.util.InputMismatchException;
import java.util.Scanner;
public class DemoThread2 {
    public static void main(String... args) throws InterruptedException {
        ArrayAdd arr = new ArrayAdd();
        Thread thr1 = new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                arr.generateeven();
            }
        });
        Thread thr2 = new Thread(new Runnable() {

            @Override
            public void run() {
                arr.generateodd();
            }
        });

        Thread thr3 = new Thread(new Runnable() {

            @Override
            public void run() {
                arr.displayArrays();
            }
        });
        thr1.start();
        thr2.start();
        thr1.join();
        thr2.join();
        thr3.start();
    }
    }
