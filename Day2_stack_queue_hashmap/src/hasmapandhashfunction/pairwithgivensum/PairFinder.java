package hasmapandhashfunction.pairwithgivensum;

import java.util.HashMap;
import java.util.Map;

public class PairFinder {

    // Finds a pair of elements whose sum is equal to the target
    public static Pair findPairWithSum(int[] array, int targetSum) {
        Map<Integer, Integer> seenNumbers = new HashMap<>();

        for (int number : array) {
            int complement = targetSum - number;

            // Check if the complement exists in the map
            if (seenNumbers.containsKey(complement)) {
                return new Pair(complement, number);
            }

            // Store the current number in the map
            seenNumbers.put(number, 1);
        }

        return null;
    }
}
