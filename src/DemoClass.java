public class DemoClass {

  //  Writing numbers to two different files using Threads

    public static void main(String... args){
        filewrite1 f1=new filewrite1();
        Filewrite2 f2=new Filewrite2();
        f1.start();
        f2.start();
    }
}
