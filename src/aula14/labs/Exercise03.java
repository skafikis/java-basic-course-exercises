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

public class Exercise03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type F or M: ");
        String letter = scanner.nextLine();

        if(letter.equalsIgnoreCase("F")){
            System.out.println("Female");
        }
        else if(letter.equalsIgnoreCase("M")){
            System.out.println("Male");
        }
        else{
            System.out.println("Invalid");
        }

    }
}
