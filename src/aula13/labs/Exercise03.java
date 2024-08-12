/**
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um Programa que peça dois números e imprima a soma.
 */

package aula13.labs;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int number1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int number2 = scanner.nextInt();

        int t = number1 + number2;
        System.out.println("A soma desses dois numeros é " + t);
    }
}
