import java.util.Arrays;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Array of bogie type names
        String[] bogieTypes = {"Sleeper", "AC Chair", "First Class", "Cargo", "Guard"};

        // Display original array
        System.out.println("\nOriginal Bogie Types:");
        System.out.println(Arrays.toString(bogieTypes));

        // --- Built-in Sorting ---
        Arrays.sort(bogieTypes);

        // Display sorted array
        System.out.println("\nSorted Bogie Types (Alphabetical):");
        System.out.println(Arrays.toString(bogieTypes));

        System.out.println("\nSystem ready for further operations.");
    }
}