/**
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
 */

package aula13.labs;

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a medida do raio para calcular a área: ");
        double valueRaio = scanner.nextDouble();

        double valueArea = (Math.PI * valueRaio * valueRaio);
        System.out.println("O circulo de raio " + valueRaio + " tem a area de " + valueArea);
    }
}
