import java.util.ArrayList;
import java.util.Iterator;

public class EgCoolection3 {
    //ArrayList- retainALL and removeALL methods
    public static void main(String... args){
        ArrayList<String> name1= new ArrayList<String>();
        name1.add("john");
        name1.add("FRANS");
        ArrayList<String> name2=new ArrayList<String>();
        name2.add("tom");
        name2.add("jeff");
        name1.addAll(name2); // adds all elements in name2 to name
        name1.retainAll(name2);//removes all elements
       Iterator itr= name1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
