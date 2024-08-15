/*
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um Programa que leia três números e mostre o maior e o menor deles.
 * */

package aula14.labs;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite um segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("Digite um terceiro numero: ");
        double num3 = scanner.nextDouble();

        double maior = num1;
        double menor = num1;

        // Verificando maior
        if(num2 >= maior){
            maior = num2;
        }
        if (num3 >= maior) {
            maior = num3;
        }

        // Verificando menor
        if(num2 <= menor){
            menor = num2;
        }
        if (num3 <= menor) {
            menor = num3;
        }

        System.out.println("O maior numero é " + maior);
        System.out.println("O menor numero é " + menor);

        scanner.close();
    }
}
