package collectionMap;

import java.util.*;

/**
 * Demonstrates sorting using Comparable and Comparator.
 */
class CustomDogComparator implements Comparator<Animal> {
    /**
     * Custom comparator to sort animals by weight.
     */
    @Override
    public int compare(Animal o1, Animal o2) {
        return Integer.compare(o1.weight, o2.weight);
    }
}

public class LearnComparableAndComparator {

    public static void main(String[] args) {
        // Creating Animal objects
        Animal d1 = new Animal("Sandy", 2, 14);
        Animal d2 = new Animal("Bruno", 2, 15);
        Animal d3 = new Animal("Tommy", 7, 16);
        Animal d4 = new Animal("Lipi", 4, 13);

        // Adding animals to a list
        List<Animal> dogs = new ArrayList<>();
        dogs.add(d1);
        dogs.add(d2);
        dogs.add(d3);
        dogs.add(d4);

        // Printing original list (before sorting)
        System.out.println("Original List:");
        System.out.println(dogs);

        // Sorting using the natural order (Comparable: age, then name)
        Collections.sort(dogs);
        System.out.println("\nSorted by natural order (age, then name):");
        System.out.println(dogs);

        // Sorting using custom weight comparator
        Collections.sort(dogs, new CustomDogComparator());
        System.out.println("\nSorted by weight:");
        System.out.println(dogs);

        // Sorting by age using an anonymous comparator
        Collections.sort(dogs, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return Integer.compare(o1.age, o2.age);
            }
        });
        System.out.println("\nSorted by age:");
        System.out.println(dogs);

        // Sorting by name using an anonymous comparator
        Collections.sort(dogs, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println("\nSorted by name (using anonymous class):");
        System.out.println(dogs);

        // Sorting by name using a lambda expression (simpler)
        dogs.sort((o1, o2) -> o1.name.compareTo(o2.name));
        System.out.println("\nSorted by name (using lambda):");
        System.out.println(dogs);
    }
}
