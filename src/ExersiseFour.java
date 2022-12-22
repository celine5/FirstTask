
import java.util.Scanner;
public class ExersiseFour {
    public static void main(String... args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the product number");
        int productnum = s.nextInt();
        int quansold = s.nextInt();
        ExersiseFour ef = new ExersiseFour();
        ef.productPrice(productnum, quansold);
    }
        public void productPrice(int productnum, int quansold){
            double retprice = 0.0;

            switch (productnum) {
                case 1:
                    retprice = productnum * 22.50;
                    break;
                case 2:
                    retprice = productnum * 44.50;
                    break;
                case 3:
                    retprice = productnum * 9.98;
                    break;
                default:
                    System.out.println(" enter wrong productnum");

            }
            System.out.println("the retailprice is " + retprice);
        }


    }




