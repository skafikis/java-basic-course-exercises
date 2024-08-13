/**
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
 * Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo
 * (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente.
 * João precisa que você faça um programa que leia a variável peso (peso de peixes) e verifique se há excesso.
 * Se houver, gravar na variável excesso e na variável multa o valor da multa que João deverá pagar. Caso contrário
 * mostrar tais variáveis com o conteúdo ZERO.
 */

package aula13.labs;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso do peixe: ");
        double fishWeight = scanner.nextDouble();

        if(fishWeight <= 50) {
            System.out.println("O peso do peixe se encontra dentro do limite permitido.");
        } else {
            System.out.println("O peso do peixe ultrapassa o limite permitido.");

            double fine = ((fishWeight - 50) * 4);
            System.out.printf("Você será multado em R$ %.2f", fine);
        }
    }
}
