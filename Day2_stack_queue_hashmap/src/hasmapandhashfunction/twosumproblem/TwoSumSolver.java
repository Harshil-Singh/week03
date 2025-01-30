package hasmapandhashfunction.twosumproblem;

import java.util.HashMap;

public class TwoSumSolver {

    // Find two indices whose elements add up to the target
    public int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Store the current element with its index
            map.put(nums[i], i);
        }

        return new int[]{}; // Return empty array if no pair found
    }
}
