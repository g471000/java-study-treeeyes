package ch11.StackQueue;

import java.util.EmptyStackException;
import java.util.Stack;

public class ExpValidCheck {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage : java ExpValidCheck \"EXPRESSION\"");
            System.out.println("Example : java ExpValidCheck \"((2+3)*1)+3\"");
            System.exit(0);
        }

        Stack s = new Stack();
        String expression = args[0];

        System.out.println("Expression: " + expression);

        try {
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);

                if (ch == '(') {
                    s.push(ch + "");
                } else if (ch == ')') {
                    s.pop();
                }
            }

            if (s.isEmpty()) {
                System.out.println("Matched Parenthesis!");
            } else {
                System.out.println("Unmatched Parenthesis!");
            }
        } catch (EmptyStackException e) {
            System.out.println("Not matched Parenthesis!");
        }
    }
}
