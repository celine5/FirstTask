import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filewriter3 extends Thread{
    @Override
    public void run() {
        byte b[]= {104,105,106,107,108,109,110,111,112,113,114,115};
        File obj = new File("file1.txt");
        try {
            FileOutputStream fout = new FileOutputStream(obj);
            System.out.println("writing to file1");
            fout.write(b);
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
