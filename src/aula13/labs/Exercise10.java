/**
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Farenheit.
 */

package aula13.labs;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite graus Celsius? ");
        double celsius = scanner.nextDouble();

        double fahrenheit = ((celsius * 1.8) + 32);
        System.out.println(celsius + " graus Celsius eh o mesmo que " + fahrenheit + " graus Fahrenheit.");
    }
}
