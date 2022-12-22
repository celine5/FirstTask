import java.util.Scanner;
public class ExerciseEight {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of eggs you have");
        int N=sc.nextInt();
        ExerciseEight ee=new ExerciseEight();
        ee.display(N);
        //int gross=N/144;
    }
    public void display(int N) {
        int gross,dozen,balgross,baleggs;
        gross=N/144;//9
        System.out.println(gross);
        balgross=N%144;//46
        System.out.println(balgross);
        dozen=balgross/12;//3
        System.out.println(dozen);
        baleggs=balgross%12;
       System.out.println(baleggs);
       System.out.println("gross: "+ gross+ " dozen: " + dozen + "balsegg:" + baleggs);
    }
}

