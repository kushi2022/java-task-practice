
public class Car {

    // Instance variables
    String brand;             // Non-primitive (String) - the brand of the car
    String model;             // Non-primitive (String) - the model of the car
    int year;                 // Primitive (int) - manufacturing year
    float engineCapacity;     // Primitive (float) - engine capacity in liters
    boolean isElectric;       // Primitive (boolean) - if the car is electric
    char safetyRating;        // Primitive (char) - safety rating (e.g., 'A', 'B')

    // Static variable (Common for all Car objects)
    static String type = "Vehicle";

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Car Type: " + type);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Engine Capacity: " + engineCapacity + " liters");
        System.out.println("Electric: " + (isElectric ? "Yes" : "No"));
        System.out.println("Safety Rating: " + safetyRating);
    }

    // Main method to create and display car instances
    public static void main(String[] args) {
        // Create a Car object
        Car car1 = new Car();

        // Assign values to the Car object fields directly
        car1.brand = "Tesla";
        car1.model = "Model S";
        car1.year = 2023;
        car1.engineCapacity = 0.0f;  // Electric cars don't have engine capacity in liters
        car1.isElectric = true;
        car1.safetyRating = 'A';

        // Display details of the car
        car1.displayCarDetails();
    }
}