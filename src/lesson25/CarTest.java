package lesson25;

public class CarTest {
    public static void main(String[] args) {
        Car corolla = new Car();
        corolla.brand = "Toyota";
        corolla.model = "Corolla";
        corolla.passengerNumber = 5;
        corolla.gasTank = 50;
        corolla.gasCost = 5.0;

        System.out.println("The brand of the car is: " + corolla.brand);
        System.out.println("The model of the car is: " + corolla.model);
        corolla.showingAutonomy();


        Car focus = new Car();
        focus.brand = "Ford";
        focus.model = "Focus";
        focus.passengerNumber = 5;
        focus.gasTank = 55;
        focus.gasCost = 5.5;

        System.out.println("The brand of the car is: " + focus.brand);
        System.out.println("The model of the car is: " + focus.model);
        focus.showingAutonomy();
    }
}
