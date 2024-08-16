/*
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um Programa que leia um número e exiba o dia correspondente da semana.
 * (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
 * */

package aula14.labs;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite numeros(1-7) que irão corresponder a dias da semana: ");
        int diaNum = scanner.nextInt();

        switch (diaNum){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("VALOR_INVALIDO");
        }
        scanner.close();
    }
}
