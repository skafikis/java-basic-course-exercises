/*
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
 * */

package aula14.labs;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type an letter: ");
        String letter = scanner.nextLine();

        if("AEIOU".contains(letter)){
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }
    }
}
