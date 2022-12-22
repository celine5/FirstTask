package programsdemo;

public class Student1 {
    int rollNo;
    String name;
    static String college = "cts";

    Student1(int r, String n) {
        rollNo = r;
        name = n;
    }

    //creating a default constructor
  /* void display(){
   System.out.println(id+" "+name);
   } */
    // creating a parameterized constuctor;'
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}

/*   public static void main(String... args){
       Student1 s1=new Student1(111,"doll");
       Student1 s2=new Student1(121,"doss");

       s1.display();
       s2.display();
      // s3.display();
    //   s4.display();
   }
} */