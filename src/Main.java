import java.util.LinkedHashSet;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize LinkedHashSet for ordered + unique bogies
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();
        System.out.println("Train formation initialized using LinkedHashSet.");

        // --- Add Bogies ---
        System.out.println("\nAdding bogies...");

        addBogie(trainFormation, "Engine");
        addBogie(trainFormation, "Sleeper");
        addBogie(trainFormation, "Cargo");
        addBogie(trainFormation, "Guard");

        // Attempt duplicate
        System.out.println("\nAttempting to add duplicate 'Sleeper'...");
        addBogie(trainFormation, "Sleeper");

        // Display Final Formation
        System.out.println("\nFinal train formation (in order):");
        System.out.println(trainFormation);

        // Program continues
        System.out.println("\nSystem ready for further operations.");
    }

    // Helper method to show duplicate handling
    public static void addBogie(LinkedHashSet<String> set, String bogie) {
        boolean added = set.add(bogie);

        if (added) {
            System.out.println("Attached bogie: " + bogie);
        } else {
            System.out.println("Duplicate ignored: " + bogie);
        }
    }
}