package oops3.learnPackage;

public class MainClass {
    public static void main(String[] args) {
        Teacher teacherObj = new Teacher();
        teacherObj.teachingClass =12;// Public Variable can be accessed within same package non subclass
//        teacherObj.id = 123; // Error : Because id is Private Variable, Access Denied
        teacherObj.name = "Same Package Non-Subclass"; // protected variable: Can be accessed from Same Package non-subclass;
        teacherObj.subject = "math";// default variable: Can be accessed from Same Package non-subclass





    }

}
