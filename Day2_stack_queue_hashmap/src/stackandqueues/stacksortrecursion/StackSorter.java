package stackandqueues.stacksortrecursion;

import java.util.Stack;

public class StackSorter {

    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int topElement = stack.pop();
            sortStack(stack);
            insertAtCorrectPosition(stack, topElement);
        }
    }

    private static void insertAtCorrectPosition(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
        } else {
            int topElement = stack.pop();
            insertAtCorrectPosition(stack, value);
            stack.push(topElement);
        }
    }
}
