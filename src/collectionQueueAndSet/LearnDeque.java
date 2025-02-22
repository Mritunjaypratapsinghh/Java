package collectionQueueAndSet;

import java.util.ArrayDeque;

public class LearnDeque {
    public static void main(String[] args) {
        // Creating an ArrayDeque
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Adding elements
        deque.offer(10);       // Adds element at the end
        deque.offerLast(20);   // Adds element at the end (same as offer)
        deque.offerFirst(30);  // Adds element at the front
        System.out.println("Deque after adding elements: " + deque);

        // Removing elements
        System.out.println("Poll (removes first): " + deque.poll());       // Removes first element
        System.out.println("Poll Last (removes last): " + deque.pollLast()); // Removes last element
        System.out.println("Deque after polling: " + deque);

        // Adding new elements
        deque.offer(100);
        System.out.println("Deque after offering 100: " + deque);

        // Peeking elements
        System.out.println("Peek (first element): " + deque.peek());         // Retrieves first element
        System.out.println("Peek First (first element): " + deque.peekFirst()); // Retrieves first element (same as peek)
        System.out.println("Peek Last (last element): " + deque.peekLast()); // Retrieves last element

        // Using ArrayDeque as a stack
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(12);  // Pushes element onto stack
        stack.push(13);
        stack.push(14);
        System.out.println("Stack: " + stack);

        System.out.println("Pop from stack: " + stack.pop()); // Removes and returns the top element
        System.out.println("Peek stack (top element): " + stack.peek()); // Retrieves top element without removing

        // Using ArrayDeque as a queue
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(100);
        queue.offer(200);
        queue.offer(300);
        System.out.println("Queue: " + queue);

        System.out.println("Poll from queue: " + queue.poll()); // Removes and returns the first element
        System.out.println("Peek queue (front element): " + queue.peek()); // Retrieves front element without removing
    }
}
