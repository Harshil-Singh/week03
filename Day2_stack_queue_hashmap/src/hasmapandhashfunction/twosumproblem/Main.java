package hasmapandhashfunction.twosumproblem;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        TwoSumSolver solver = new TwoSumSolver();
        int[] result = solver.findTwoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No valid pair found.");
        }
    }
}

