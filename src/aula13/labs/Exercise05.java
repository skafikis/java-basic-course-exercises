/**
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um Programa que converta metros para centímetros.
 */

package aula13.labs;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma medida em metros: ");
        double valueMeters = scanner.nextDouble();

        double valueCentimeters = (valueMeters * 100);
        System.out.println("Sua medida em centimetros é " + valueCentimeters);
    }
}
