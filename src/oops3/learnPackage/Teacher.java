package oops3.learnPackage;
import java.util.Scanner;
public class Teacher {
    public int teachingClass;// Public
    private int id;// Private
    protected String name;// Protected
    String subject;//Default


    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.teachingClass = 10;
        t1.id =919; // id is private variable, So only Teacher class can access it(Within Same Class)
        t1.name = "SameClass"; // protected variable can be accessed from same class
        t1.subject = "math"; // default variable can be accessed from same class;
    }
}

class Student extends Teacher{

    public static void main(String[] args) {
        Student t2 = new Student();
        t2.teachingClass = 12;// Public Variable can be accessed within the same package subclass;
//        t2.id = 919; //Error: because id is private variable so only Teacher class can access it, not even subclass(Child) can access it.
        t2.name = "SubClass"; // Protected variable can be accessed from Same Package Subclass;
        t2.subject = "math";// default keyword: Can be accessed from Same Package Subclass;

    }
}