package ch11.StackQueue;

import java.util.*;

public class StackQueueEx {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList();

        for (int i = 0; i < 10; i++) {
            st.push(i);
            q.offer(i);
        }

        System.out.println("== Stack ==");
        System.out.println(st);
        System.out.print("Remove: ");
        while (!st.empty()) {
            System.out.print(st.pop());
        }
        System.out.println();

        System.out.println("== Queue ==");
        System.out.println(q);
        System.out.print("Remove: ");
        while (!q.isEmpty()) {
            System.out.print(q.poll());
        }
    }
}
