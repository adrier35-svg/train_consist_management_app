public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Passenger bogie capacities
        int[] capacities = {72, 78, 24, 60, 45};

        // Display original array
        System.out.print("\nOriginal Capacities: ");
        printArray(capacities);

        // --- Bubble Sort ---
        int n = capacities.length;

        for (int i = 0; i < n - 1; i++) {

            // Each pass
            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (capacities[j] > capacities[j + 1]) {

                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Display sorted array
        System.out.print("\nSorted Capacities: ");
        printArray(capacities);

        System.out.println("\n\nSystem ready for further operations.");
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}