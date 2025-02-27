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

    private static void demonstrateHashMap() {
        System.out.println("--- HashMap (Unordered, Fast Lookup) ---");
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Cherry");
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");

        System.out.println("Get key 1: " + hashMap.get(1));
        hashMap.remove(2);
        System.out.println("Contains key 3: " + hashMap.containsKey(3));
        System.out.println("Get or default for key 2: " + hashMap.getOrDefault(2, "0"));
        System.out.println("Contains value 'Apple': " + hashMap.containsValue("Apple"));
        System.out.println("Keys: " + hashMap.keySet());
        System.out.println("Remove key 3 if value is 'Cherry': " + hashMap.remove(3, "Cherry"));
        System.out.println("Values: " + hashMap.values());
        System.out.println("Entries: " + hashMap.entrySet());
        System.out.println("HashMap: " + hashMap);
    }

    private static void demonstrateLinkedHashMap() {
        System.out.println("--- LinkedHashMap (Maintains Insertion Order) ---");
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Cherry");
        linkedHashMap.put(1, "Apple");
        linkedHashMap.put(2, "Banana");
        System.out.println("LinkedHashMap: " + linkedHashMap);
    }

    private static void demonstrateTreeMap() {
        System.out.println("--- TreeMap (Sorted Order) ---");
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Cherry");
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");
        System.out.println("TreeMap: " + treeMap);
    }

    private static void demonstrateHashtable() {
        System.out.println("--- Hashtable (Thread-Safe, No Null Keys/Values) ---");
        Map<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(3, "Cherry");
        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        System.out.println("Hashtable: " + hashtable);
    }

    private static void demonstrateConcurrentHashMap() {
        System.out.println("--- ConcurrentHashMap (Thread-Safe, High Performance) ---");
        Map<Integer, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put(3, "Cherry");
        concurrentMap.put(1, "Apple");
        concurrentMap.put(2, "Banana");
        System.out.println("ConcurrentHashMap: " + concurrentMap);
    }
}
