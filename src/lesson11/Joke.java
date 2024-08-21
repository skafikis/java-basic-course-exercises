package lesson11;

public class Joke {
    public static void main(String[] args) {
        int Oct31 = 031;
        int Dec25 = 25;

        System.out.println(Oct31 == Dec25);
        // "Octal 031" is interpreted as 25, and "Decimal 25" is 25.
    }
}
