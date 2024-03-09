public class Vehicle {
    private double price;
    private String colour;
    private String model;

    // Constructor to initialize attributes
    public Vehicle(double price, String colour, String model) {
        this.price = price;
        this.colour = colour;
        this.model = model;
    }

    // Method to display vehicle details
    public void display() {
        System.out.println("Vehicle details: ");
        System.out.println("Price " + price);
        System.out.println("Colour: " + colour);
        System.out.println("Model: " + model);
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of vehicle class
        Vehicle vehicle1 = new Vehicle(7000000, "White", "BMW");

        // Display vehicle details
        vehicle1.display();
    }
}
