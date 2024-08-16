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

        if(letter.length() > 1){
            System.out.println("Não é valido!\nDigite apenas um caracter!");
        } else {
            if(letter.equalsIgnoreCase("a")){
                System.out.println("Vogal");
            }
            else if(letter.equalsIgnoreCase("e")){
                System.out.println("Vogal");
            }
            else if(letter.equalsIgnoreCase("i")){
                System.out.println("Vogal");
            }
            else if(letter.equalsIgnoreCase("o")){
                System.out.println("Vogal");
            }
            else if(letter.equalsIgnoreCase("u")){
                System.out.println("Vogal");
            }
            else {
                System.out.println("Consoante");
            }
        }

    }
}
