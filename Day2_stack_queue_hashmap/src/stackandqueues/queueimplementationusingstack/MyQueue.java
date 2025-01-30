package stackandqueues.queueimplementationusingstack;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> stack1;  // For enqueue
    private Stack<Integer> stack2;  // For dequeue

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int value) {
        stack1.push(value);
        System.out.println("Enqueued: " + value);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return stack2.pop();
    }
}
