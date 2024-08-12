/**
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um Programa que peça as 4 notas bimestrais e mostre a média.
 */

package aula13.labs;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua nota bimestral 1: ");
        double notaBimestral1 = scanner.nextDouble();

        System.out.println("Digite sua nota bimestral 2: ");
        double notaBimestral2 = scanner.nextDouble();

        System.out.println("Digite sua nota bimestral 3: ");
        double notaBimestral3 = scanner.nextDouble();

        System.out.println("Digite sua nota bimestral 4: ");
        double notaBimestral4 = scanner.nextDouble();

        double mediaBimestral = ((notaBimestral1 + notaBimestral2 + notaBimestral3 + notaBimestral4) / 4);
        System.out.println("Sua meida bimestral é de " + mediaBimestral);
    }
}
