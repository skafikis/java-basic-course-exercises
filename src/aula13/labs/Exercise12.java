/**
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal,
 * usando a seguinte fórmula: /(72.7*altura) - 58
 */

package aula13.labs;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura? ");
        double altura = scanner.nextDouble();

        double pesoIdeal = ((72.7 * altura) - 58);
        System.out.printf("Seu peso ideal seria: %.2f", pesoIdeal);
    }
}
