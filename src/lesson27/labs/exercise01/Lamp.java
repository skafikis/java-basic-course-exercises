package lesson27.labs.exercise01;

public class Lamp {

    String brand;
    double power;
    boolean isOn;

    void turnOn() {
        isOn = true;
    }

    void turnOff() {
        isOn = false;
    }

    void showState(){
        if(isOn){
            System.out.println("Is on!!");
        }
        else {
            System.out.println("Is off");
        }
    }

    void chooseState(){
        if(isOn){
            turnOff();
        } else {
            turnOn();
        }


    }
}
