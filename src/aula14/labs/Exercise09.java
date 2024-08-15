/*
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um Programa que leia três números e mostre-os em ordem decrescente.
 * */

package aula14.labs;

import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um primeiro numero: ");
        double valorX = scanner.nextDouble();

        System.out.println("Digite um segundo numero: ");
        double valorY = scanner.nextDouble();

        System.out.println("Digite um terceiro numero: ");
        double valorZ = scanner.nextDouble();

        double maiorNumero = valorX;
        double numeroIntermediario = valorY;
        double menorNumero = valorZ;

        // Ordenando caso o maiorNumero seja menor que o menorNumero
        if (maiorNumero <= menorNumero) {
            menorNumero = valorX;
            maiorNumero = valorZ;

            // caso o numeroIntermediario seja maior que o atualMaior
            if (numeroIntermediario >= maiorNumero) {
                maiorNumero = valorY;
                numeroIntermediario = valorZ;
            } // caso o numero intermediario seja menor que menoNumero
            else if (numeroIntermediario <= menorNumero) {
                numeroIntermediario = valorX;
                menorNumero = valorY;
            }
        } // Ordenando caso o maiorNumero seja menor que o numeroIntermediario
        else if (maiorNumero <= numeroIntermediario) {
            numeroIntermediario = valorX;
            maiorNumero = valorY;

            // caso o numeroIntermediario seja menor que o menorNumero
            if (numeroIntermediario <= menorNumero) {
                menorNumero = valorX;
                numeroIntermediario = valorZ;
            }
        } // Ordenando somente o menorNumero e o numeroIntermediario
        else {
            // caso o numeroIntermediario seja menor que o menorNumero
            if (numeroIntermediario <= menorNumero) {
                menorNumero = valorX;
                numeroIntermediario = valorZ;
            }
        }


        System.out.println("Ordem decrescente: " + maiorNumero + ", " + numeroIntermediario + ", " + menorNumero);
        scanner.close();
    }
}
