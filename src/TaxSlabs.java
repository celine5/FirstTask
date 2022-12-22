import java.util.Scanner;
public class TaxSlabs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the salary and gender");
        String gender = sc.next();
        System.out.println(gender);
        int salary = sc.nextInt();
        System.out.println(salary);
        TaxSlabs ts = new TaxSlabs();
        ts.taxCalculation(salary, gender);
    }

    public void taxCalculation(int salary, String gender) {
        double tax = 0.0;
        if (salary > 800000) {
            tax = (salary * 0.3);
        } else if ((salary >= 50001) && (salary <= 800000)) {
            tax = (salary * 0.2);
        } else if ((salary >= 190001) && (salary <= 500000)) {
            tax = (salary * 0.1);
        } else if ((salary >= 180001) && (salary <= 190000)) {
            if (gender.equals("male"))
                tax = (salary * 0.1);
            else
                tax = 0.0;
        }
        System.out.println(tax);
    }
}
