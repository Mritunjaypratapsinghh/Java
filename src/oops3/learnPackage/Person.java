package oops3.learnPackage;

public class Person {
    private int age;
    private String name;

    boolean canBeChanged = true;
    public void setAge(int age){//Setter Method for Private Variable age;
        if(canBeChanged){
            if(age>0){
            this.age = age;
        }

    }}


    boolean canBeAccessed = true;
    public int getAge(){//Getter Method for Private Variable age;

        return age;
    }

}
