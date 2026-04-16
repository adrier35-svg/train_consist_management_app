import java.util.HashMap;
import java.util.Map;

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Initialize HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacityMap = new HashMap<>();
        System.out.println("Bogie-capacity mapping initialized.");

        // --- Add Bogie Capacities ---
        System.out.println("\nAdding bogie capacities...");

        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 78);
        bogieCapacityMap.put("First Class", 24);

        // --- Display Mapping ---
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            String bogie = entry.getKey();
            Integer capacity = entry.getValue();

            System.out.println(bogie + " -> Capacity: " + capacity);
        }

        // Program continues
        System.out.println("\nSystem ready for further operations.");
    }
}