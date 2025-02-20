package oops4;

// Class representing a car
class Cars {
    private String model;
    private int year;

    // Constructor to initialize car model and year
    public Cars(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Overriding toString() to provide meaningful string representation
    @Override
    public String toString() {
        return "Car model is " + model + " and year is " + year;
    }

    // Overriding equals() to compare Cars objects based on model and year
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // Same reference, so objects are equal
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false; // Ensure obj is not null and is of the same class
        }

        Cars that = (Cars) obj;
        return this.model.equals(that.model) && this.year == that.year;
    }
}

// Class demonstrating object comparison
public class LearnObjectClass {
    public static void main(String[] args) {
        // Creating two separate car objects with the same data
        Cars obj = new Cars("Honda", 2022);
        Cars obj1 = new Cars("Honda", 2022);

        // Calling toString() implicitly
        System.out.println(obj.toString());

        // Comparing references (will be false since they are different objects)
        System.out.println(obj == obj1);

        // Comparing values using overridden equals() method (will be true)
        System.out.println(obj.equals(obj1));
    }
}
