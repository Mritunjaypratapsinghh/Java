package collectionQueueAndSet;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        // Creating a Queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add(10);   // Throws exception if the capacity is full
        queue.offer(20); // Returns false if the capacity is full
        queue.offer(30);
        queue.offer(40);

        // Printing the queue
        System.out.println("Queue after adding elements: " + queue);

        // Removing the head element
        queue.poll(); // Removes and returns the head element (FIFO)
        System.out.println("Queue after poll operation: " + queue);

        // Peeking at the head element
        System.out.println("Head element using peek(): " + queue.peek());

        // Removing all elements one by one
        while (!queue.isEmpty()) {
            queue.poll();
        }

        // Trying to peek into an empty queue
        System.out.println("Peek after clearing queue: " + queue.peek()); // Returns null if empty
        System.out.println(queue.poll());// this poll method does not throw exception but if we use remove method it will
//        System.out.println(queue.remove()); it will throw exception because removing from empty queue
    }
}
