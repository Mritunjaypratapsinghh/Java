package oops3.package2;
import oops3.learnPackage.Teacher;
public class MainInPackage2 {

    public static void main(String[] args){
        Teacher obj = new Teacher();
        obj.teachingClass = 12; // Public Variable can be accessed outside package from Non subclass too;
//        obj.id = 919; //Error : Cannot Access Private Variable Outside Package
//        obj.name = "Outside Package Non Subclass"; //Error: Protected Variable cannot be accessed from outside package Non-Subclass
//        obj.subject = "math"; //Error : Default Variable : Cannot Accessed from outside package Non-Subclass

    }
}

class Children extends Teacher{ // Inheriting Teacher class from outside package;

    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.teachingClass = 12;// Public Variable can be accessed from outside package subclass too;
//        obj.id = 919;//Error: Cannot Access Private Variable from outside package subclass too;
//        obj.name = "Outside Package SubClass";// Error: protected members are only accessible via inheritance, meaning they must be accessed through this or a subclass instance.
//    ❌ Direct Access via obj in Children (i.e., obj.name = "Some Value";)
//
//    obj is a Teacher reference, not a Children instance.
//    protected members are only accessible via inheritance, meaning they must be accessed through this or a subclass instance.
//        obj.subject = "math"; //Error : Default Variable : Cannot Access from outside package Subclass

        Children childrenObj = new Children();
        childrenObj.name = "Can be Accessed Now";


    }
}