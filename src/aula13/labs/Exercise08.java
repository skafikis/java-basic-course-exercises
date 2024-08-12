/**
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
 * Calcule e mostre o total do seu salário no referido mês.
 */

package aula13.labs;

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        double salaryHour = scanner.nextDouble();

        System.out.println("Quantas horas você trabalha no mês? ");
        double hourMonth = scanner.nextDouble();

        double salaryMonth = (salaryHour * hourMonth);

        System.out.println("Você recebe R$ " + salaryMonth + " por mês.");
    }
}
