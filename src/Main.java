// Custom Exception Class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie Class
class PassengerBogie {
    String name;
    int capacity;

    // Constructor with validation
    public PassengerBogie(String name, int capacity) throws InvalidCapacityException {

        if (capacity <= 0) {
            throw new InvalidCapacityException(
                    "Invalid capacity for " + name + ". Capacity must be greater than 0."
            );
        }

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

        System.out.println("=== Train Consist Management App ===");

        try {
            // Valid bogie
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println("Created: " + b1);

            // Invalid bogie (will throw exception)
            PassengerBogie b2 = new PassengerBogie("AC Chair", 0);
            System.out.println("Created: " + b2);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nSystem continues safely...");
    }
}// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie Class
class GoodsBogie {
    String shape;   // Cylindrical / Rectangular
    String cargo;

    public GoodsBogie(String shape) {
        this.shape = shape;
    }

    // Assign cargo with safety validation
    public void assignCargo(String cargo) {
        try {
            // Rule: Petroleum cannot go in Rectangular bogie
            if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException(
                        "Unsafe assignment! Petroleum cannot be loaded in Rectangular bogie."
                );
            }

            this.cargo = cargo;
            System.out.println("Cargo '" + cargo + "' assigned to " + shape + " bogie.");

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment attempt completed.\n");
        }
    }

    @Override
    public String toString() {
        return shape + " Bogie carrying " + (cargo != null ? cargo : "No Cargo");
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe assignment
        b1.assignCargo("Petroleum");

        // Unsafe assignment (will trigger exception)
        b2.assignCargo("Petroleum");

        // Program continues normally
        System.out.println("Final Bogie States:");
        System.out.println(b1);
        System.out.println(b2);

        System.out.println("\nSystem continues safely...");
    }
}