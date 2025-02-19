package oops4;

public class LearnInterface {
    public static void main(String[] args) {
        // Creating an instance of Monkey
        Monkey m1 = new Monkey();
        m1.eats();
        m1.drinks();

        // Cannot assign value to final variable (Uncommenting below line will cause an error)
        // Animal.legs = 3;

        System.out.println(Animal.legs);
    }
}

// Interface representing a Pet
interface Pet {
    void sings();
    void drinks();
}

// Interface representing an Animal
interface Animal {
    int legs = 4; // By default, variables in an interface are public, static, and final

    void eats();
    void drinks();

    // Default method with a body
    default void walk() {
        System.out.println("Animal is Walking");
    }
}

// Monkey class implementing both Animal and Pet interfaces
class Monkey implements Animal, Pet {
    @Override
    public void eats() {
        System.out.println("Monkey is eating");
    }

    @Override
    public void sings() {
        System.out.println("Monkey is singing");
    }

    @Override
    public void drinks() {
        System.out.println("Monkey is drinking");
    }
}
