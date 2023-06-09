package com.bl.stack_problem;
import java.util.LinkedList;
public class StackMain {
    private LinkedList<Integer> queue;

    public StackMain() {
        queue = new LinkedList<Integer>();
    }

    public void enqueue(int value) {
        queue.addLast(value);
    }

    public void printQueue() {
        for (int item : queue) {
            System.out.print(item + " ");
        }
    }

    public int dequeue() {
        return queue.removeFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public static void main(String[] args) throws IllegalStateException {
        System.out.println("Welcome to Stack with linked list problem.");
        StackMain queue = new StackMain();

        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        queue.printQueue();

        System.out.println("\nQueue size: " + queue.size());

        int element = queue.dequeue();
        System.out.println("Removed element: " + element);

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }

        System.out.println("\nQueue size: " + queue.size());
    }
}
