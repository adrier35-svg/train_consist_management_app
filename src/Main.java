import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Sorted array of bogie IDs
        String[] bogieIds = {"B101", "B205", "B309", "B412", "B523"};

        // (Safety) Ensure sorted
        Arrays.sort(bogieIds);

        // Display sorted bogies
        System.out.println("\nSorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        // User input
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Bogie ID to search: ");
        String key = scanner.nextLine();

        // --- Binary Search ---
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = key.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                found = true;
                break;
            } else if (comparison < 0) {
                high = mid - 1;  // Search left half
            } else {
                low = mid + 1;   // Search right half
            }
        }

        // Display result
        if (found) {
            System.out.println("Bogie ID " + key + " FOUND in the train.");
        } else {
            System.out.println("Bogie ID " + key + " NOT FOUND.");
        }

        System.out.println("\nSystem ready for further operations.");

        scanner.close();
    }
}