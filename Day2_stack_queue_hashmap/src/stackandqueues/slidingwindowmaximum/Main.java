package stackandqueues.slidingwindowmaximum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = SlidingWindowSolver.findMaxInSlidingWindow(nums, k);

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Sliding Window Maximums: " + Arrays.toString(result));
    }
}
