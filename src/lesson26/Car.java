package lesson26;

public class Car {

    String brand;
    String model;
    int passengerNumber;
    double gasTank;
    double gasCost;

    void showingAutonomy() {
        System.out.println("The autonomy of the car is: " + (gasTank * gasCost) + " km\\l\n");
    }

    double getAutonomy() {
        System.out.println("Method getAutonomy() was called");
        return gasTank * gasCost;
    }
}
