package oops4;

public class LearnInnerClass {

    // Non-static inner class
    class Toy {
        int price;
    }

    // Static inner class
    static class Playstation {
        int price;
    }

    public static void main(String[] args) {
        // Creating an instance of the outer class
        LearnInnerClass obj = new LearnInnerClass();

        // Creating an instance of the non-static inner class
        Toy t1 = obj.new Toy();
        t1.price = 1200;

        // Creating an instance of the static inner class
        Playstation ps = new LearnInnerClass.Playstation();
        ps.price = 56000;
    }
}
