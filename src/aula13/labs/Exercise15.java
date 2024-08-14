/**
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
 * Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda,
 * 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
 * -. salário bruto.
 * a. quanto pagou ao INSS.
 * b. quanto pagou ao sindicato.
 * c. o salário líquido.
 * d. calcule os descontos e o salário líquido, conforme a tabela
 * abaixo:
 */

package aula13.labs;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora trabalhada? ");
        double salaryHour = scanner.nextDouble();

        System.out.println("Quantas horas você trabalha no mês? ");
        double hourWorkMonth = scanner.nextDouble();


        double grossIncome = (salaryHour * hourWorkMonth);
        System.out.printf("Salário Bruto: R$ %.2f%n", grossIncome);

        double inss = ((grossIncome /100) * 8);
        System.out.printf("INSS (8%%): R$ %.2f%n", inss);

        double sindicato = ((grossIncome /100) * 5);
        System.out.printf("Sindicato (5%%): R$ %.2f%n", sindicato);

        double impostoRenda = (grossIncome * 0.11);
        System.out.printf("Imposto de Renda (11%%): R$ %.2f%n", impostoRenda);

        double netIncome = grossIncome - (impostoRenda + inss + sindicato);
        System.out.printf("Salário Líquido: R$ %.2f%n", netIncome);
    }
}
