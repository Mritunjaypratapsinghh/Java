package collectionAndLists;

import java.util.ArrayList;
import java.util.List;

public class LearnLists {
    public static void main(String[] args) {
        // Initializing an array
        int[] a = new int[5];

        // Creating lists
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Adding elements to list2
        list2.add(1);
        list2.add(2);
        list2.add(3);

        // Adding elements to list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1);

        // Accessing and modifying elements
        System.out.println("First element: " + list.get(0)); // Retrieves first element
        list.set(1, 200); // Replaces element at index 1
        list.add(1, 200); // Inserts 200 at index 1

        // Finding index of elements
        System.out.println("First occurrence of 200: " + list.indexOf(200));
        System.out.println("Last occurrence of 200: " + list.lastIndexOf(200));

        // Printing lists
        System.out.println("Array reference: " + a);
        System.out.println("List contents: " + list);
        System.out.println("List size: " + list.size());
        System.out.println("Is list empty? " + list.isEmpty());

        // Removing elements
        list.remove(1); // Removes element at index 1
        list.remove(Integer.valueOf(10)); // Removes first occurrence of 10
        System.out.println("List after removals: " + list);

        // Adding all elements from list2 to list
        list.addAll(list2);
        System.out.println("List after adding all elements from list2: " + list);

        // Removing all elements of list2 from list
        list.removeAll(list2);
        System.out.println("List after removing all elements from list2: " + list);

        // Retaining only elements present in list2
        list.add(1);
        list.retainAll(list2);
        System.out.println("List after retainAll operation: " + list);

        // Converting list to array
        Object[] b = list.toArray();
        System.out.println("Elements in array format:");
        for (Object i : b) {
            System.out.println(i);
        }
    }
}
