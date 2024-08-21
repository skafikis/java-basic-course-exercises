/*
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo.
 * Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
 * Dicas:
 * Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
 * Triângulo Equilátero: três lados iguais;
 * Triângulo Isósceles: quaisquer dois lados iguais;
 * Triângulo Escaleno: três lados diferentes;
 * */

package aula14.labs;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com a medida do primeiro lado: ");
        double medidaLado1 = scanner.nextDouble();

        System.out.println("Entre com a medida do segundo lado: ");
        double medidaLado2 = scanner.nextDouble();

        System.out.println("Entre com a medida do terceiro lado: ");
        double medidaLado3 = scanner.nextDouble();


        if((medidaLado1 + medidaLado2 > medidaLado3) &&
                (medidaLado2 + medidaLado3 > medidaLado1) &&
                (medidaLado3 + medidaLado1 > medidaLado2)){

            if((medidaLado1 == medidaLado2) && (medidaLado2 == medidaLado3)){
                System.out.println("Triângulo Equilátero");
            }
            else if ((medidaLado1 == medidaLado2) ||
                    (medidaLado2 == medidaLado3) ||
                    (medidaLado3 == medidaLado1)) {
                System.out.println("Triângulo Isósceles");
            }
            else {
                System.out.println("Triângulo Escaleno");
            }
        }
        else {
            System.out.println("Os valores não formam um triângulo");
        }


        scanner.close();
    }
}
