package hasmapandhashfunction.pairwithgivensum;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 4, 7, 12, 5, 9};
        int targetSum = 13;

        Pair result = PairFinder.findPairWithSum(array, targetSum);

        if (result != null) {
            System.out.println("Pair found: (" + result.first + ", " + result.second + ")");
        } else {
            System.out.println("No pair found with the given sum.");
        }
    }
}
