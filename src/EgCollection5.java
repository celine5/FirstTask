import programsdemo.StudentArray;

import java.util.Iterator;
import java.util.LinkedList;

public class EgCollection5 {
    //collection- LinkdList Example
    public static void main(String... args){
            StudentArray ANNIE = new StudentArray("ANNIE","12bce");
            StudentArray JENI = new StudentArray("JENI","13bce");
            boolean found = false;
            LinkedList<StudentArray> name = new LinkedList<>();
            name.add(ANNIE);
            name.add(JENI);
            Iterator<StudentArray> itr = name.descendingIterator();
            while(itr.hasNext()){
                StudentArray s = itr.next();
                if(s.regNo.contains("12bce")){
                    System.out.println("Student is found");
                    found=true;
                    break;
                }
            }
            if(!found){
                System.out.println("Student not found");
            }
        }
    }


