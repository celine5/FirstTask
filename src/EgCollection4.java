import java.util.LinkedList;
import java.util.ListIterator;

public class EgCollection4 {
    //LinkedList -traversing a list
    public static void main(String... args) {
        LinkedList<String> name = new LinkedList<String>();

        name.add("annie");
        name.add("jensi");
        name.add("mercy");
        ListIterator<String> itr = name.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

