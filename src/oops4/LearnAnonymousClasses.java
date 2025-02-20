package oops4;

public class LearnAnonymousClasses {

    // Anonymous inner class extending OuterClass
    OuterClass obj = new OuterClass() {
        void sing() {
            // Implementation here
        }

        @Override
        public void outerMethod() {
            // Implementation here
        }
    };

    // Anonymous inner class implementing SuperInterface
    SuperInterface obj2 = new SuperInterface() {
        @Override
        public void interfaceMethod() {
            // Implementation here
        }
    };

    // Lambda expression for functional interface
    FunctionalInterface obj3 = () -> {
        // Implementation here
    };

    public static void main(String[] args) {
        Walkable walkable = (steps) -> {
            System.out.println("Walked " + steps + " steps");
            return steps;
        };

        walkable.walks(5);

        Walkable obj2 = (steps) -> 2 * steps;
        System.out.println(obj2.walks(5));
    }
}

// Outer class definition
class OuterClass {
    public void outerMethod() {
        // Implementation here
    }
}

// Interface definition
interface SuperInterface {
    void interfaceMethod();
}


interface FunctionalInterface {
    void method();
}

interface Walkable {
    int walks(int steps);
}
