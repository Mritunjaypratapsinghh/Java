package collectionMap;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class LearnMap{
    public static void main(String[] args) {
        // 1. HashMap (Unordered, Fast Lookup)
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "Cherry");
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        System.out.println("HashMap: " + hashMap); // No ordering guarantee

        // 2. LinkedHashMap (Maintains Insertion Order)
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(3, "Cherry");
        linkedHashMap.put(1, "Apple");
        linkedHashMap.put(2, "Banana");
        System.out.println("LinkedHashMap: " + linkedHashMap); // Insertion order maintained

        // 3. TreeMap (Sorted Order)
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Cherry");
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");
        System.out.println("TreeMap: " + treeMap); // Sorted order by key

        // 4. Hashtable (Thread-Safe, No null keys/values)
        Map<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(3, "Cherry");
        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        System.out.println("Hashtable: " + hashtable); // No ordering guarantee

        // 5. ConcurrentHashMap (Thread-Safe, High Performance)
        Map<Integer, String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put(3, "Cherry");
        concurrentMap.put(1, "Apple");
        concurrentMap.put(2, "Banana");
        System.out.println("ConcurrentHashMap: " + concurrentMap); // No ordering guarantee
    }
}
