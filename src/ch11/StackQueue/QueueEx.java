package ch11.StackQueue;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        System.out.println("Enter [help] for the guide.");

        while (true) {
            System.out.print(">> ");
            try {
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();

                if ("".equals(input)) {
                    continue;
                }

                if (input.equalsIgnoreCase("q")) {
                    System.out.println("Exiting....");
                    System.exit(0);
                } else if (input.equalsIgnoreCase("help")) {
                    System.out.println(" help -- show help document.");
                    System.out.println(" q or Q -- Quit the program.");
                    System.out.println(" history -- show last " + MAX_SIZE + " command history.");
                } else if (input.equalsIgnoreCase("history")) {
                    int i = 0;
                    save(input);

                    LinkedList tmp = (LinkedList) q;
                    ListIterator ite = tmp.listIterator();

                    while (ite.hasNext()) {
                        System.out.println(++i + ": " + ite.next());
                    }
                } else {
                    save(input);
                    System.out.println(input);
                }
            } catch (Exception e) {
                System.out.println("Input Error.");
            }
        }
    }

    public static void save(String input) {
        if (!"".equals(input)) {
            q.offer(input);
        }

        if (q.size() > MAX_SIZE) {
            q.remove();
        }
    }
}
