import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Standard {
    public static void main(String s[]) {
        StuDetail[] arr = {
                new StuDetail(111, "annie", "chennai"),
                new StuDetail(110, "john", "madurai"),
                new StuDetail(123, "banu", "vellore"),
                new StuDetail(112, "doll", "tvm")};
        Arrays.sort(arr, new Sortbyroll());
        System.out.println("sorted by rollNum");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
