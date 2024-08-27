package lesson27;

// Class
public class Car {

    // Attributes
    String brand;
    String model;
    int passengerNumber;
    double gasTank;
    double gasCost;


    // Methods
    // Method simple don't have return
    void showingAutonomy() {
        System.out.println("The autonomy of the car is: " + (gasTank * gasCost) + " km\\l\n");
    }

    // Method with return
    double getAutonomy() {
        System.out.println("Method getAutonomy() was called");
        return gasTank * gasCost;
    }

    // Method with parameters
    double calculateGas(double km){
        double quantityGas = km/gasCost;
        return quantityGas;
    }
}
