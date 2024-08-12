/**
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
 */

package aula13.labs;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int number = scanner.nextInt();

        System.out.println("O número informado foi [" + number + "].");
    }
}
