/*
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um Programa que leia três números e mostre o maior deles.
 * */

package aula14.labs;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite um segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("Digite um terceiro numero: ");
        double num3 = scanner.nextDouble();

        double maior;

        if((num1 >= num2) && (num1 >= num3)){
            maior = num1;
        } else if ((num2 >= num1) && (num2 >= num3)){
            maior = num2;
        } else {
            maior = num3;
        }

        System.out.println("O maior numero é " + maior);
        scanner.close();
    }
}
