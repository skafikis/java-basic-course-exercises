/**
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um Programa que peça 2 números inteiros e um número real.
 * Calcule e mostre:
 * a. o produto do dobro do primeiro com metade do segundo .
 * b. a soma do triplo do primeiro com o terceiro.
 * c. o terceiro elevado ao cubo.
 */

package aula13.labs;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um primeiro numero inteiro: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Digite um segundo numero inteiro: ");
        int secundNumber = scanner.nextInt();

        System.out.println("Digite um numero real: ");
        double realNumber = scanner.nextDouble();

        int a = ((firstNumber * 2) * (secundNumber / 2));
        System.out.println("O produto do dobro do primeiro com metade do segundo eh " + a);

        double b = ((firstNumber * 3) + (realNumber));
        System.out.println("A soma do triplo do primeiro com o terceiro eh " + b);

        double c = Math.pow(realNumber, 3);
        System.out.println("O terceiro elevado ao cubo eh " + c);
    }
}
