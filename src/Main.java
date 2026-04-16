import java.util.LinkedList;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize LinkedList for train consist
        LinkedList<String> trainConsist = new LinkedList<>();
        System.out.println("Train consist initialized using LinkedList.");

        // --- Add Bogies ---
        System.out.println("\nAdding bogies...");

        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial consist: " + trainConsist);

        // --- Insert Pantry Car at position 2 ---
        System.out.println("\nInserting 'Pantry Car' at position 2...");
        trainConsist.add(2, "Pantry Car");

        System.out.println("After insertion: " + trainConsist);

        // --- Remove first and last bogie ---
        System.out.println("\nRemoving first and last bogies...");
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // Final Consist
        System.out.println("Final train consist: " + trainConsist);

        // Program continues
        System.out.println("\nSystem ready for further operations.");
    }
}