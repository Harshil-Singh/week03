package quicksort;

public class ProductPriceSorter {

    // Quick Sort function
    public void quickSort(double[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);

            // Recursively sort partitions
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    // Partition function
    private int partition(double[] prices, int low, int high) {
        double pivot = prices[high];  // Pivot element
        int i = low - 1;              // Index of smaller element

        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                // Swap prices[i] and prices[j]
                double temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Swap prices[i + 1] and pivot (prices[high])
        double temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

    // Display product prices
    public void displayProductPrices(double[] prices) {
        for (double price : prices) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}
