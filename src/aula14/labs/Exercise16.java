/*
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. O programa deverá pedir
 * os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
 *
 * a. Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir
 * os demais valores, sendo encerrado;
 * b. Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
 * c. Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
 * d. Se o delta for positivo, a equação possui duas raiz reais;
 * */

package aula14.labs;

import java.security.Key;
import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora de equação de segundo grau 'ax² + bx + c'");

        System.out.println("Tecle valor para 'a': ");
        double a = sc.nextDouble();

        // Verificando se é equação de segundo grau.
        if(a == 0) {
            System.out.println("O valor de 'a' não pode ser zero. Esta não é uma equação do segundo grau.");
            return;
        }

        System.out.println("Tecle valor para 'b': ");
        double b = sc.nextDouble();

        System.out.println("Tecle valor para 'c': ");
        double c = sc.nextDouble();

        double delta = (Math.pow(b, 2) - (4 * a * c));

        // Verificando se há raiz real.
        if(delta < 0) {
            // System.out.println("Valor de delta: " + delta);
            System.out.println("Delta negativo. A equação não possui raízes reais.");
            return;
        }

        // Verificando se delta é zero, indicando raiz unica
        if(delta == 0) {
            double raizUnica = -b / (2 * a);
            // System.out.println("Valor de delta: " + delta);
            System.out.println("Delta igual a zero, a equação possui raiz unica: " + raizUnica);
        } else {
            System.out.println("Valor de delta: " + delta);

            // Calculando x1 e x2
            double xUm = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("Valor x1 = " + xUm);

            double xDois = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Valor x2 = " + xDois);
        }
        sc.close();
    }
}
