import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Bogie collection (try empty vs filled)
        List<String> bogieIds = new ArrayList<>();

        // Uncomment below to test valid scenario
        // bogieIds.add("B101");
        // bogieIds.add("B205");

        String searchKey = "B101";

        try {
            searchBogie(bogieIds, searchKey);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nSystem continues safely...");
    }

    // Search method with fail-fast validation
    public static void searchBogie(List<String> bogieIds, String key) {

        // --- UC20: Defensive Check ---
        if (bogieIds.isEmpty()) {
            throw new IllegalStateException(
                    "Cannot perform search. Train consist is empty!"
            );
        }

        // --- Linear Search ---
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(key)) {
                found = true;
                break;
            }
        }

        // Result
        if (found) {
            System.out.println("Bogie ID " + key + " FOUND.");
        } else {
            System.out.println("Bogie ID " + key + " NOT FOUND.");
        }
    }
}