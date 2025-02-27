package collectionMap;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class LearnMap {
    public static void main(String[] args) {
        demonstrateHashMap();
        demonstrateLinkedHashMap();
        demonstrateTreeMap();
        demonstrateHashtable();
        demonstrateConcurrentHashMap();
    }

    // Demonstrates HashMap usage
    private static void demonstrateHashMap() {
        System.out.println("--- HashMap (Unordered, Fast Lookup) ---");
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Cherry");
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");

        // Accessing values
        System.out.println("Get key 1: " + hashMap.get(1));

        // Removing a key-value pair
        hashMap.remove(2);

        // Checking key presence
        System.out.println("Contains key 3: " + hashMap.containsKey(3));

        // Fetching a value with a default fallback
        System.out.println("Get or default for key 2: " + hashMap.getOrDefault(2, "0"));

        // Checking value presence
        System.out.println("Contains value 'Apple': " + hashMap.containsValue("Apple"));

        // Converting keys and values to lists
        List<Integer> keys = new ArrayList<>(hashMap.keySet());
        System.out.println("Keys: " + keys);

        // Conditional removal of a key-value pair
        System.out.println("Remove key 3 if value is 'Cherry': " + hashMap.remove(3, "Cherry"));

        List<String> values = new ArrayList<>(hashMap.values());
        System.out.println("Values: " + values);

        // Printing all entries
        System.out.println("Entries: " + hashMap.entrySet());
        System.out.println("HashMap: " + hashMap);

        // Iterating over the map
        hashMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }

    // Demonstrates LinkedHashMap usage
    private static void demonstrateLinkedHashMap() {
        System.out.println("--- LinkedHashMap (Maintains Insertion Order) ---");
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Cherry");
        linkedHashMap.put(1, "Apple");
        linkedHashMap.put(2, "Banana");
        System.out.println("LinkedHashMap: " + linkedHashMap);
    }

    // Demonstrates TreeMap usage
    private static void demonstrateTreeMap() {
        System.out.println("--- TreeMap (Sorted Order) ---");
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Cherry");
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");
        System.out.println("TreeMap: " + treeMap);
    }

    // Demonstrates Hashtable usage
    private static void demonstrateHashtable() {
        System.out.println("--- Hashtable (Thread-Safe, No Null Keys/Values) ---");
        Map<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(3, "Cherry");
        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        System.out.println("Hashtable: " + hashtable);
    }

    // Demonstrates ConcurrentHashMap usage
    private static void demonstrateConcurrentHashMap() {
        System.out.println("--- ConcurrentHashMap (Thread-Safe, High Performance) ---");
        Map<Integer, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put(3, "Cherry");
        concurrentMap.put(1, "Apple");
        concurrentMap.put(2, "Banana");
        System.out.println("ConcurrentHashMap: " + concurrentMap);
    }
}