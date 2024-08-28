/*
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas e unidades do
 * mesmo. Observando os termos no plural a colocação do "e", da vírgula entre outros.
 *
 * Exemplo:
 * 326 = 3 centenas, 2 dezenas e 6 unidades
 * 12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16
 * */

package aula14.labs;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number less than 1000: ");
        double numLessMil = scanner.nextDouble();

        if(numLessMil > 1000) {
            System.out.println("You entered a number higher 1000");
            return;
        }
        else {
            double hundred = numLessMil / 100;
            System.out.println("Numero de Centenas = " + hundred);
        }
    }
}
