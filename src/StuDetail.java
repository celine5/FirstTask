import java.util.Comparator;

public class StuDetail {
    int rollNo;
    String name,address;
    public StuDetail(int rollNo,String name,String address){
        this.rollNo=rollNo;
        this.name=name;
        this.address=address;
    }
    public String toString(){
        return this.rollNo+" "+this.name+" "+this.address;
    }

}
class
Sortbyroll implements Comparator<StuDetail> {
    public int compare(StuDetail a, StuDetail b){
        return a.rollNo - b.rollNo;
    }
}
