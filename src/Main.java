import java.util.ArrayList;
import java.util.List;

// Bogie class
class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create Bogie List
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 78));
        bogies.add(new Bogie("First Class", 24));

        // Display bogies
        System.out.println("\nTrain Bogies:");
        bogies.forEach(System.out::println);

        // --- UC10: Aggregate Capacity ---
        System.out.println("\nCalculating total seating capacity...");

        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)        // Extract capacities
                .reduce(0, Integer::sum);   // Sum them

        // Display result
        System.out.println("Total Seating Capacity: " + totalCapacity);

        // Program continues
        System.out.println("\nSystem ready for further operations.");
    }
}