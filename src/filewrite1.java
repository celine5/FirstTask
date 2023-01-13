import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class filewrite1 extends Thread{
    @Override
    public void run(){
        File obj = new File("file1.txt");
        try {
            FileOutputStream fout = new FileOutputStream(obj);
            System.out.println("writing to file1");
            for(int i=0;i<10000;i++)
            {
                System.out.println("Thread1 write"+i);
                fout.write(i);
            }
            fout.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    }
