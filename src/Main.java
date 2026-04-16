import java.util.Scanner;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie IDs (unsorted)
        String[] bogieIds = {"B101", "B205", "B309", "B412", "B523"};

        // Display available bogies
        System.out.print("\nAvailable Bogie IDs: ");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        // User input
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nEnter Bogie ID to search: ");
        String searchKey = scanner.nextLine();

        // --- Linear Search ---
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {   // Safe string comparison
                found = true;
                break;                   // Early termination
            }
        }

        // Display result
        if (found) {
            System.out.println("Bogie ID " + searchKey + " FOUND in the train.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT FOUND.");
        }

        System.out.println("\nSystem ready for further operations.");

        scanner.close();
    }
}