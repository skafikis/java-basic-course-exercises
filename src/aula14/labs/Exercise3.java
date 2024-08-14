/*
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um Programa que verifique se uma letra digitada é "F" ou "M".
 * Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
 * */

package aula14.labs;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type F or M: ");
        String letter = scanner.nextLine();

        switch (letter){
            case "F":
                System.out.println("Female");
            break;
            case "M":
                System.out.println("Male");
            break;
            default:
                System.out.println("Invalid");
        }
    }
}
