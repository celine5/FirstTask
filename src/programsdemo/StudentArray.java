package programsdemo;

public class StudentArray {
    public String name;
    public String regNo;
    public StudentArray(String name,String regNo) {
        this.name=name;
        this.regNo=regNo;
    }
    public void display(){
        System.out.println(name+regNo);
    }

}
