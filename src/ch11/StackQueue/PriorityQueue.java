package ch11.StackQueue;

import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        Queue q = new java.util.PriorityQueue();
        q.offer(3);
        q.offer(1);
        q.offer(5);
        q.offer(2);
        q.offer(4);
        System.out.println(q);
        System.out.println();

        System.out.println("Queue Poll Order");
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }
}
