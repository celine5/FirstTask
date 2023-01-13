import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filewrite2 extends Thread{
    @Override
    public void run() {

        File obj = new File("file2.txt");
        try {
            FileOutputStream fout1 = new FileOutputStream(obj);
            System.out.println("writing to file2");
            for(int i=0;i<10000;i++)
            {
                System.out.println("Thread2 write"+i);
                fout1.write(i);
            }
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
