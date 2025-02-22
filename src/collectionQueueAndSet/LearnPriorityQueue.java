package collectionQueueAndSet;

import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        // Creating Min-Heap (default PriorityQueue)
        Queue<Integer> minHeap = new PriorityQueue<>();
        // Creating Max-Heap using custom comparator
        Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        // Adding elements to both heaps
        int[] elements = {30, 40, 10, 50};
        for (int element : elements) {
            minHeap.add(element);
            maxHeap.add(element);
        }

        // Printing both heaps
        System.out.println("Min-Heap: " + minHeap);
        System.out.println("Max-Heap: " + maxHeap);

        // Polling elements from both heaps
        System.out.println("Polled from Min-Heap: " + minHeap.poll());
        System.out.println("Polled from Max-Heap: " + maxHeap.poll());

        // Printing heaps after polling
        System.out.println("Min-Heap after polling: " + minHeap);
        System.out.println("Max-Heap after polling: " + maxHeap);
    }
}
