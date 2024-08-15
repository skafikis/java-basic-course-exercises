/*
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um Programa que peça dois números e imprima o maior deles.
* */

package aula14.labs;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um primeiro numero inteiro: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite um segundo numero inteiro: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.printf("O maior numero digitado é %,d", num1);
        } else {
            System.out.printf("O maior numero digitado é %,d", num2);
        }
    }
}
