package collectionAndLists;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
import java.util.LinkedList;

public class ListMore {
    public static void main(String[] args) {
        // Creating a list of fruits
        List<String> fruits = new ArrayList<>();

        // Adding elements to the list
        fruits.add("Kiwi");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");

        // Iterating using enhanced for-loop
        System.out.println("Using enhanced for-loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Iterating using traditional for-loop
        System.out.println("Using traditional for-loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // Iterating using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> iterator = fruits.iterator(); // from Collection
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Creating a sublist from the fruits list
        List<String> fruitsSublist = fruits.subList(1, 3); // Sublist
        System.out.println("Sublist from index 1 to 2: " + fruitsSublist);

        // Stack implementation for vegetables
        Stack<String> vegetables = new Stack<>();
        vegetables.push("Broccoli");
        vegetables.push("Onion");
        vegetables.push("Okra");
        vegetables.push("Potato");

        System.out.println("Vegetables Stack: " + vegetables);

        // Removing the top element (LIFO - Last In First Out)
        vegetables.pop();
        System.out.println("After pop operation: " + vegetables);

        // Peeking at the top element without removing it
        System.out.println("Top element in stack: " + vegetables.peek());

        // Using List interface with LinkedList implementation
        /*
        Assigning a LinkedList object to a List reference allows flexibility—you can switch between different List implementations
        (like ArrayList, Vector, etc.) without changing other parts of the code.
         */
        List<String> cities = new LinkedList<>();

        // Adding elements
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("Houston");

        // Displaying the list
        System.out.println("Cities List: " + cities);

        // Removing an element
        cities.remove("Chicago");
        System.out.println("After removal: " + cities);

        // LinkedList implementation for cities
        /*
        When you need LinkedList-specific methods like addFirst(), addLast(), removeFirst(), and removeLast().
        Java's LinkedList is implemented as a doubly linked list, regardless of whether you use the List interface or LinkedList directly.
         */
        LinkedList<String> city = new LinkedList<>();
        city.add("New York");
        city.add("Los Angeles");
        city.add("Chicago");
        city.add("Houston");

        System.out.println("City LinkedList: " + city);

        // Adding elements at specific positions
        city.addFirst("San Francisco");
        city.addLast("Seattle");
        System.out.println("After adding first and last: " + city);

        // Removing elements
        city.removeFirst();
        city.removeLast();
        System.out.println("After removing first and last: " + city);
    }
}
