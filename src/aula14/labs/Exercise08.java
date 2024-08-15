/*
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a
 * decisão é sempre pelo mais barato.
 * */

package aula14.labs;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do primeiro produto: ");
        double valor1 = scanner.nextDouble();

        System.out.println("Informe o valor do segundo produto: ");
        double valor2 = scanner.nextDouble();

        System.out.println("Informe o valor do terceiro produto: ");
        double valor3 = scanner.nextDouble();

        double maisBarato = valor1;

        if(valor2 <= maisBarato){
            maisBarato = valor2;
        }
        if (valor3 <= maisBarato){
            maisBarato = valor3;
        }

        System.out.println("O produto mais barato é R$ " + maisBarato);
    }
}
