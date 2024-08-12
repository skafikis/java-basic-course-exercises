/**
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
 */

package aula13.labs;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado do quadrado");
        double side = scanner.nextDouble();

        double valueArea = (side * side);
        System.out.println("Essa é a área do seu quadrado " + valueArea);

        double valueDoubleArea = (valueArea * 2);
        System.out.println("E o dobro da sua área é " + valueDoubleArea);

    }
}