package stackandqueues.circulartourproblem;



import java.util.Deque;
import java.util.LinkedList;
import java.util.Arrays;

public class Main {

    public static int[] findMaxInSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            // Remove indices outside the current window
            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove smaller elements from the back
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }

            // Add current element at the back of the deque
            deque.offerLast(i);

            // Add the maximum element of the current window to the result
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = findMaxInSlidingWindow(nums, k);

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Sliding Window Maximums: " + Arrays.toString(result));
    }
}

