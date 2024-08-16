/*
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um programa para a leitura de duas notas parciais de um aluno.
 * O programa deve calcular a média alcançada por aluno e apresentar:
 *
 * - A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
 * - A mensagem "Reprovado", se a média for menor do que sete;
 * - A mensagem "Aprovado com Distinção", se a média for igual a dez.
 * */

package aula14.labs;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua nota do primeiro bimestre: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite sua nota do segundo bimestre: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if(media == 10){
            System.out.println("Aprovado com Distinção");
        } else if(media >= 7){
            System.out.println("Aprovado");
        } else if (media < 7) {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}
