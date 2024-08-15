/*
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
 * */

package aula14.labs;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero real: ");
        double num1 = scanner.nextDouble();

        if(num1 >= 0) {
            System.out.printf("[%.0f] é um numero positivo",num1);
        } else {
            System.out.printf("[%.0f] é um numero negativo",num1);
        }
    }
}
