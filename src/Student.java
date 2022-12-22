public class Student {
    String name;
    int regNo;
    String branch;
    Student(String n,int r,String b){
        this.name=n;
        this.regNo=r;
        this.branch=b;

    }
    public void stuDisplay(){
        System.out.println("Name:"+this.name);
        System.out.println("RegNO:"+this.regNo);
        System.out.println("Branch:"+this.branch);
    }


}