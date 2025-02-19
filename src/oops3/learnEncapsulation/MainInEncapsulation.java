package oops3.learnEncapsulation;

import oops3.learnPackage.Person;

public class MainInEncapsulation {

    public static void main(String[] args) {
        Person p1 = new Person();
//        p1.age =10;  Error : Direct access of private variable is not possible Outside the same class
        p1.setAge(10);// we cannot set directly hence we are using setter method
        System.out.println(p1.getAge()); // Getting private variable  age value using getter
        Person p2 = new Person();
        p2.setAge(12);
        System.out.println(p2.getAge());
    }
}
