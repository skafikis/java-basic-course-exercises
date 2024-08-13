/**
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um Programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.
 * o C = (5 * (F-32) / 9)
 */

package aula13.labs;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite graus Fahrenheit? ");
        double fahrenheit = scanner.nextDouble();

        double celsius = ((fahrenheit - 32) / 1.8);

        System.out.println(fahrenheit + " graus Fahrenheit eh o mesmo que " + celsius + " graus Celsius.");

    }
}
