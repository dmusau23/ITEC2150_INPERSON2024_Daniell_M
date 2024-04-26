package Generics.Stack;

import java.util.*;

public class SplitStack {

    public static void splitStack(Stack<Integer> stack) {
        Stack<Integer> negativeStack = new Stack<>();
        Stack<Integer> positiveStack = new Stack<>();

        // Separate positive and negative numbers
        while (!stack.isEmpty()) {
            int num = stack.pop();
            if (num < 0) {
                negativeStack.push(num);
            } else {
                positiveStack.push(num);
            }
        }

        // Rebuild the original stack with negatives at the bottom and positives on top
        while (!positiveStack.isEmpty()) {
            stack.push(positiveStack.pop());
        }
        while (!negativeStack.isEmpty()) {
            stack.push(negativeStack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.addAll(Arrays.asList(5, -5, 67, -45, 67, 9, 0, -42, 56, -7));
        splitStack(stack1);
        System.out.println("Output for stack1: " + stack1);

        Stack<Integer> stack2 = new Stack<>();
        stack2.addAll(Arrays.asList(1, -2, -3, 4, -5, 6, -7, 8, 9));
        splitStack(stack2);
        System.out.println("Output for stack2: " + stack2);
    }
}

