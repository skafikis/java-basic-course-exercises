/*
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda,
 * que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do
 * Salário Bruto, mas não é descontado (é a empresa que deposita).
 * O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor
 * da sua hora e a quantidade de horas trabalhadas no mês.
 *
 * Desconto do IR:
 * Salário Bruto até 900 (inclusive) - isento
 * Salário Bruto até 1500 (inclusive) - desconto de 5%
 * Salário Bruto até 2500 (inclusive) - desconto de 10%
 * Salário Bruto acima de 2500 - desconto de 20%
 *
 * Imprima na tela as informações, dispostas conforme o exemplo abaixo.
 * No exemplo o valor da hora é 5 e a quantidade de hora é 220.
 * Salário Bruto: (5 * 220) : R$ 1100,00
 * (-) IR (5%) : R$ 55,00
 * (-) INSS ( 10%) : R$ 110,00
 * FGTS (11%) : R$ 121,00
 * Total de descontos : R$ 165,00
 * Salário Liquido : R$ 935,00
 * */

package aula14.labs;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor hora trabalhada: ");
        double valorHoraTrabalhada = scanner.nextDouble();

        System.out.println("Digite quantas horas foram trabalhada: ");
        double totalHorasTrabalhadas = scanner.nextDouble();

        double salarioBruto = (valorHoraTrabalhada * totalHorasTrabalhadas);
        System.out.println("Salário Bruto: (" + valorHoraTrabalhada + " * " + totalHorasTrabalhadas + ") : R$ " + salarioBruto);


        double impostoRenda = 0;

        if (salarioBruto <= 900) {
            impostoRenda = 0;
        } else if (salarioBruto <= 1500) {
            impostoRenda = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            impostoRenda = salarioBruto * 0.10;
        } else {
            impostoRenda = salarioBruto * 0.20;
        }

        System.out.printf("(-) IR (%.0f%%) : R$ %.2f%n", ((impostoRenda / salarioBruto) * 100), impostoRenda);


        double inss = (salarioBruto / 100) * 10;
        System.out.println("(-) INSS (10%) : R$ " + inss);

        double fgts = ((salarioBruto / 100) * 11);
        System.out.println("FGTS (11%) : R$ " + fgts);

        double descontosTotais = (impostoRenda + inss);
        System.out.println("Total de desconto : R$ " + descontosTotais);

        double salarioLiquido = (salarioBruto - descontosTotais);
        System.out.println("Salário Liquido : R$ " + salarioLiquido);
    }

}
