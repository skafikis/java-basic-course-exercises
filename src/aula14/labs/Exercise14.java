/*
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e
 * calcule a sua média.
 *
 * O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito
 * for A, B ou C ou “REPROVADO” se o conceito for D ou E.
 * */

package aula14.labs;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String conceitoAvaliacao;

        for(int i = 0; i <= 4; i++){
            System.out.println("Digite o nome da matéria: ");
            String nomeMateria = scanner.nextLine();

            System.out.println("Digite o peso da avaliação: ");
            double pesoAvaliacaoMateria = scanner.nextDouble();

            System.out.println("Digite a nota do aluno no primeiro momento: ");
            double notaAluno1 = scanner.nextDouble();

            System.out.println("Digite a nota do aluno no segundo momento: ");
            double notaAluno2 = scanner.nextDouble();

            double mediaAritmeticaSimples = ((notaAluno1 + notaAluno2) / 2);

            if(mediaAritmeticaSimples >= 9.0 && mediaAritmeticaSimples <= 10.0){
                conceitoAvaliacao = "A - APROVADO";
            }
            else if (mediaAritmeticaSimples >= 7.5 && mediaAritmeticaSimples < 9.0){
                conceitoAvaliacao = "B - APROVADO";
            }
            else if (mediaAritmeticaSimples >= 6.0 && mediaAritmeticaSimples < 7.5) {
                conceitoAvaliacao = "C - APROVADO";
            }
            else if (mediaAritmeticaSimples >= 4.0 && mediaAritmeticaSimples < 6.0) {
                conceitoAvaliacao = "D - REPROVADO";
            }
            else {
                conceitoAvaliacao = "E - REPROVADO";
            }

            System.out.printf("Matéria: %s; Média de Aproveitamento: %.2f; Conceito: %s%n", nomeMateria, mediaAritmeticaSimples, conceitoAvaliacao);
            scanner.nextLine();

        }
        scanner.close();
    }
}
