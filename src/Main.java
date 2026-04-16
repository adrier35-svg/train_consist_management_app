import java.util.HashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize HashSet for unique bogie IDs
        Set<String> bogieSet = new HashSet<>();
        System.out.println("Train consist (unique bogie IDs) initialized.");

        // --- UC3: Add Bogie IDs ---
        System.out.println("\nAdding bogie IDs...");

        addBogie(bogieSet, "B101");
        addBogie(bogieSet, "B102");
        addBogie(bogieSet, "B103");
        addBogie(bogieSet, "B101"); // Duplicate
        addBogie(bogieSet, "B102"); // Duplicate

        // Display Unique Bogies
        System.out.println("\nUnique bogie IDs in train:");
        for (String bogie : bogieSet) {
            System.out.println(bogie);
        }

        // Program continues
        System.out.println("\nSystem ready for further operations.");
    }

    // Helper method to add bogie with duplicate check behavior
    public static void addBogie(Set<String> set, String bogieId) {
        boolean added = set.add(bogieId);

        if (added) {
            System.out.println("Added bogie: " + bogieId);
        } else {
            System.out.println("Duplicate ignored: " + bogieId);
        }
    }
}