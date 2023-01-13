import programsdemo.StudentArray;

import java.util.ArrayList;
import java.util.Iterator;

public class EgCollection1 {
    //Collection - Student ArrayList
    //Arraylist implements StudentArray
    public static void main(String... args) {
        StudentArray s1 = new StudentArray("ANNIE ", "123");
        StudentArray s2 = new StudentArray("MERCY ", "124");
        StudentArray s3 = new StudentArray("JENIFER ", "125");
        ArrayList<StudentArray> name = new ArrayList<>();
        name.add(s1);
        name.add(s2);
        name.add(s3);
        Iterator<StudentArray> itr = name.iterator();
        while (itr.hasNext()) {
            StudentArray s = itr.next();
            System.out.println(s.name + s.regNo);
        }
    }
}

