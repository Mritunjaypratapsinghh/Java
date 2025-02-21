package collectionAndLists;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

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
    }
}
