package lesson24.labs.exercise01;

public class LampTest {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();

        lamp.brand = "Philips";
        lamp.lightType = "Led";
        lamp.lightColor = "Cool White";
        lamp.power = 9;

        lamp.types = new String[2];
        lamp.types[0] = "Abajur";
        lamp.types[1] = "Pendente";
    }
}
