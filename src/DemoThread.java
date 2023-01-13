public class DemoThread {
    public static void main(String[] args){

        Filewriter3 f3 = new Filewriter3();
        Filewrite2 f4 = new Filewrite2();
        f4.setPriority(10);
        f3.setPriority(1);
        f3.start();
        f4.start();
    }
}
