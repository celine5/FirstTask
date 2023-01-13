import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filewrite4 extends Thread{
    @Override
    public void run() {
        byte b[]= {116,117};
        File obj = new File("file1.txt");
        try {
            FileOutputStream fout1 = new FileOutputStream(obj);
            System.out.println("writing to file2");
            fout1.write(b);
            fout1.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
