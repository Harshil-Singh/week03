package hasmapandhashfunction.zerosumsubarrays;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 4, -7, 1, 3, 3, 1, -4, -2, -2};

        // Find and print all subarrays with zero sum
        List<int[]> result = SubarrayFinder.findZeroSumSubarrays(array);

        System.out.println("Subarrays with zero sum:");
        for (int[] subarray : result) {
            System.out.print("[");
            for (int i = subarray[0]; i <= subarray[1]; i++) {
                System.out.print(array[i] + (i < subarray[1] ? ", " : ""));
            }
            System.out.println("]");
        }
    }
}
