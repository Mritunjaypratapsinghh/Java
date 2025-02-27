package collectionMap;

/**
 * Represents an Animal with name, age, and weight.
 * Implements Comparable to define natural sorting (by age, then name).
 */
public class Animal implements Comparable<Animal> {

    String name;
    int age;
    int weight;

    // Constructor to initialize Animal object
    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Override toString() for meaningful output
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    // Natural sorting order: first by age, then by name
    @Override
    public int compareTo(Animal that) {
        if (this.age == that.age) {
            return this.name.compareTo(that.name); // Sort by name if age is the same
        }
        return this.age - that.age; // Otherwise, sort by age
    }
}
