/**
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
 * Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de
 * 18 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.
 */

package aula13.labs;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite em metros quadrados o tamanho da área que deseja pintar: ");
        double areaPintar = scanner.nextDouble();

        double quantidadeLitrosTinta = (areaPintar / 3);
        double quantidadeLatasTintas = Math.ceil(quantidadeLitrosTinta / 18);

        double valorLatasTintas = (quantidadeLatasTintas * 80);

        System.out.printf("Para uma área de %.2fm², serão necessários %.2f litros de tinta.\n", areaPintar, quantidadeLitrosTinta);
        System.out.printf("Você precisará de %.0f lata(s) de tinta.\n", quantidadeLatasTintas);
        System.out.printf("O custo total será de R$ %.2f.\n", valorLatasTintas);

    }
}
