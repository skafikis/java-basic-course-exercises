package lesson25;

public class Car {

    String brand;
    String model;
    int passengerNumber;
    double gasTank;
    double gasCost;

    void showingAutonomy() {
        System.out.println("The autonomy of the car is: " + (gasTank * gasCost) + " km\n");
    }
}
