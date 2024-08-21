package lesson11;

public class NumericalVariables {
    public static void main(String[] args) {
        byte age1 = 127; // 8 bits
        System.out.println("Hi! I'm " + age1);

        short age2 = 32767; // 16 bits
        System.out.println("Hi! I'm " + age2);

        int age3 = 2147483647; // 32 bits
        System.out.println("Hi! I'm " + age3);

        long age4 = 9223372036854775807L; // 64 bits
        System.out.println("Hi! I'm " + age4);
    }
}
