/*
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * .As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver
 * o programa que calculará os reajustes.
 * Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
 *
 * - salários até R$ 280,00 (incluindo) : aumento de 20%
 * - salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
 * - salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
 * - salários de R$ 1500,00 em diante : aumento de 5%
 *
 * Após o aumento ser realizado, informe na tela:
 *
 * - salário antes do reajuste;
 * - percentual de aumento aplicado;
 * - valor do aumento;
 * - novo salário, após o aumento.
 * */

package aula14.labs;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("[1] - Calcular reajuste de colaboradores\n[2] - Fechar calculadora");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o salario do colaborador: ");
                    double salarioColaborador = scanner.nextDouble();

                    double salarioReajustado = 0;
                    double percentualAumento = 0;
                    double valorAumento = 0;

                    if(salarioColaborador <= 280){
                        percentualAumento = 0.2;
                        valorAumento = (salarioColaborador * percentualAumento);
                        salarioReajustado = (salarioColaborador + valorAumento);

                        //salarioReajustado = (salarioColaborador * 1.20);
                    }
                    else if(salarioColaborador > 280 && salarioColaborador < 700){
                        percentualAumento = 0.15;
                        valorAumento = (salarioColaborador * percentualAumento);
                        salarioReajustado = (salarioColaborador + valorAumento);

                        //salarioReajustado = (salarioColaborador * 1.15);
                    }
                    else if(salarioColaborador > 700 && salarioColaborador < 1500){
                        percentualAumento = 0.10;
                        valorAumento = (salarioColaborador * percentualAumento);
                        salarioReajustado = (salarioColaborador + valorAumento);

                        //salarioReajustado = (salarioColaborador * 1.10);
                    }
                    else if(salarioColaborador >= 1500){
                        percentualAumento = 0.05;
                        valorAumento = (salarioColaborador * percentualAumento);
                        salarioReajustado = (salarioColaborador + valorAumento);

                        //salarioReajustado = (salarioColaborador * 1.05);
                    }

                    System.out.println("Salario: R$ " + salarioColaborador);
                    System.out.printf("Percentual de aumento aplicado: %.3f\n",percentualAumento);
                    System.out.println("Valor do aumento R$: " + valorAumento);
                    System.out.println("Salario reajustado: R$ " + salarioReajustado);

                    break;
                case 2:
                    System.out.println("Calculadora encerrada!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }


        } while (opcao != 2);
    }
}
