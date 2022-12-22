package programsdemo;

public class Student2 {
    int id;
    String name;
    int age;
    Student2(int i,String n){  //two parameter constructor
        id=i;
        name=n;
    }
    Student2(int i,String n,int a){
        id=i;
        name=n;
        age=a;
    }
    Student2(Student2 s){   //to iniatialise another object
        id=s.id;
        name=s.name;
        age=s.age;
    }
    void display(){
        System.out.println(id+" "+name+" "+age);
    }
    public static void main(String... args){
        Student2 s1=new Student2(1,"doss",20);
        Student2 s2=new Student2(2,"john",23);
        Student2 s3=new Student2(3,"johnson",25);
        s1.display();
        s2.display();
        s3.display();
    }
}
