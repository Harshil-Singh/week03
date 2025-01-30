package hasmapandhashfunction.zerosumsubarrays;

import java.util.*;

public class SubarrayFinder {

    // Finds all subarrays with a zero sum
    public static List<int[]> findZeroSumSubarrays(int[] array) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> sumIndexMap = new HashMap<>();

        int cumulativeSum = 0;

        // Initialize with sum 0 at index -1 for cases starting from the beginning
        sumIndexMap.put(0, new ArrayList<>(List.of(-1)));

        for (int i = 0; i < array.length; i++) {
            cumulativeSum += array[i];

            // If cumulativeSum is seen before, we have subarrays with zero sum
            if (sumIndexMap.containsKey(cumulativeSum)) {
                for (int start : sumIndexMap.get(cumulativeSum)) {
                    result.add(new int[]{start + 1, i});
                }
            }

            // Add the current sum to the map
            sumIndexMap.computeIfAbsent(cumulativeSum, k -> new ArrayList<>()).add(i);
        }

        return result;
    }
}
