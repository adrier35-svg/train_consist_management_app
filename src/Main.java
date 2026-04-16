import java.util.ArrayList;
import java.util.List;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize Train Consist
        List<String> trainConsist = new ArrayList<>();
        System.out.println("Train consist initialized.");
        System.out.println("Initial bogie count: " + trainConsist.size());

        // --- UC2: Add Passenger Bogies ---
        System.out.println("\nAdding passenger bogies...");

        trainConsist.add("Sleeper");
        trainConsist.add("AC Chair");
        trainConsist.add("First Class");

        // Display after insertion
        System.out.println("Bogies after addition: " + trainConsist);

        // --- Remove a Bogie ---
        System.out.println("\nRemoving 'AC Chair' bogie...");
        trainConsist.remove("AC Chair");

        // Display after removal
        System.out.println("Bogies after removal: " + trainConsist);

        // --- Check Existence ---
        System.out.println("\nChecking if 'Sleeper' exists...");
        boolean exists = trainConsist.contains("Sleeper");

        System.out.println("Sleeper exists: " + exists);

        // Final State
        System.out.println("\nFinal train consist: " + trainConsist);

        // Program continues
        System.out.println("\nSystem ready for further operations.");
    }
}