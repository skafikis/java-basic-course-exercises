/**
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal,
 * utilizando as seguintes fórmulas:
 * Para homens: (72.7*h) - 58
 * Para mulheres: (62.1*h) - 44.7
 * a. Peça o peso da pessoa e informe se ela está dentro, acima ou
 * abaixo do peso.
 */

package aula13.labs;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu sexo (M/F): ");
        String sexo = scanner.next();

        if (sexo.equalsIgnoreCase("M")) {
            double pesoIdeal = ((72.7 * altura) - 58);
            System.out.printf("Seu peso ideal seria: %.2f\n", pesoIdeal);
        } else {
            double pesoIdeal = ((62.1 * altura) - 44.7);
            System.out.printf("Seu peso ideal seria: %.2f\n", pesoIdeal);
        }


        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        if (sexo.equalsIgnoreCase("M")) {
            if (peso < ((72.7 * altura) - 58)) {
                System.out.println("Abaixo do peso ideal.");
            } else if (peso == ((72.7 * altura) - 58)) {
                System.out.println("Dentro do peso ideal.");
            } else {
                System.out.println("Acima do peso ideal.");
            }

        } else {
            if (peso < ((62.1 * altura) - 44.7)) {
                System.out.println("Abaixo do peso ideal.");
            } else if (peso == ((62.1 * altura) - 44.7)) {
                System.out.println("Dentro do peso ideal1.");
            } else {
                System.out.println("Acima do peso ideal.");
            }

        }
    }
}
