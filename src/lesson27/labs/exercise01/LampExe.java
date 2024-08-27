package lesson27.labs.exercise01;

import java.util.Scanner;

public class LampExe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lamp lamp = new Lamp();

        lamp.brand = "Philips";
        lamp.power = 9;

        lamp.showState();
        lamp.turnOn();
        lamp.showState();

        lamp.turnOff();
        lamp.showState();

        lamp.chooseState();
        lamp.showState();
    }
}
