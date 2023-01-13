import java.util.HashMap;
import java.util.Map;

public class EgMap {
    // map example;
    public static void main(String... args){
        HashMap<String, String> students = new HashMap<String, String>();
        students.put("2023121", "mercy");
        students.put("2023122", "annie");
        students.put("2023123", "john");
        students.remove("2023122");
        students.clear();
        System.out.println(students.size());

    /*    for(Map.Entry k:students.entrySet()){
            System.out.println(k.getKey()+" "+k.getValue());
        }  */
        for(String s:students.keySet()){
            System.out.println(students.get(s));
        }


    }
}
