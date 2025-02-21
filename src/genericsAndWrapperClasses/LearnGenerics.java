package genericsAndWrapperClasses;

import java.util.ArrayList;

public class LearnGenerics {
    public static void main(String[] args) {
        // Creating Dog objects with different generic types
        Dog<Integer, String> d1 = new Dog<>(8237, "Hritik");
        System.out.println("Dog 1 ID: " + d1.getId());

        Dog<String, Integer> d2 = new Dog<>("AS121", 828);
        System.out.println("Dog 2 ID: " + d2.getId());

        Dog<String, String> d3 = new Dog<>("23Y7DJ", "Mritunjay");
        System.out.println("Dog 3 ID: " + d3.getId());

        // Creating an ArrayList of Integer type
        ArrayList<Integer> list = new ArrayList<>();
    }
}

// Generic Dog class with two type parameters E (ID) and V (Name)
class Dog<E, V> {
    private E id;
    private V name;

    public Dog(E id, V name) {
        this.id = id;
        this.name = name;
    }

    public E getId() {
        return id;
    }
}
