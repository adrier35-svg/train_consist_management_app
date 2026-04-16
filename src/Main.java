import java.util.ArrayList;
import java.util.List;

// Goods Bogie class
class GoodsBogie {
    String type;   // e.g., Cylindrical, Box
    String cargo;  // e.g., Petroleum, Coal

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " Bogie carrying " + cargo;
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        // Welcome Message
        System.out.println("=== Train Consist Management App ===");

        // Create Goods Bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Box", "Coal"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Box", "Grains"));

        // Display bogies
        System.out.println("\nGoods Bogies:");
        goodsBogies.forEach(System.out::println);

        // --- UC12: Safety Validation ---
        System.out.println("\nChecking safety compliance...");

        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        // Rule: Cylindrical bogie → only Petroleum allowed
                        (!b.type.equals("Cylindrical") || b.cargo.equals("Petroleum"))
                );

        // Display Result
        if (isSafe) {
            System.out.println("Train is SAFE for operation.");
        } else {
            System.out.println("Train is NOT SAFE! Rule violation detected.");
        }

        // Program continues
        System.out.println("\nSystem ready for further operations.");
    }
}