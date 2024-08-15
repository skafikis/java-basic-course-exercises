/*
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um Programa que pergunte em que turno você estuda.
 * Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
 * Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
 * */

package aula14.labs;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seja bem-vindo!\nSelecione seu turno:\n[M] - Matutino\n[V] - Vespertino\n[N] - Noturno");
        String opcao = scanner.nextLine();

        switch (opcao){
            case "M":
                System.out.println("Bom Dia!");
                break;
            case "V":
                System.out.println("Boa Tarde!");
                break;
            case "N":
                System.out.println("Boa Noite");
                break;
            default:
                System.out.println("Valor Inválido!");
        }
    }
}
