package ch11.StackQueue;

import java.util.Stack;

public class StackEx1 {
    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args) {
        goURL("www.google.com");
        goURL("www.naver.com");
        goURL("www.youtube.com");
        goURL("www.gmail.com");

        printStatus();

        goBack();
        System.out.println("After press goBack");
        printStatus();

        goBack();
        System.out.println("After press goBack");
        printStatus();

        goForward();
        System.out.println("After press goForward");
        printStatus();

        goURL("www.github.com");
        System.out.println("After move to other address");
        printStatus();
    }

    public static void printStatus() {
        System.out.println("back: " + back);
        System.out.println("forward: " + forward);
        System.out.println("current window: " + back.peek());
        System.out.println();
    }

    public static void goURL(String url) {
        back.push(url);
        if (!forward.isEmpty()) {
            forward.clear();
        }
    }

    public static void goForward() {
        if (!forward.empty()) {
            back.push(forward.pop());
        }
    }

    public static void goBack() {
        if (!back.empty()) {
            forward.push(back.pop());
        }
    }


}
