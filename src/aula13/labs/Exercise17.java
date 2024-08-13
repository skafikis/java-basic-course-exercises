/**
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
 * Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de
 * 18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
 * o Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
 * o comprar apenas latas de 18 litros;
 * o comprar apenas galões de 3,6 litros;
 * o misturar latas e galões, de forma que o preço seja o menor.
 *
 * Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
 */

package aula13.labs;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite em metros quadrados o tamanho da área que deseja pintar: ");
        double areaPintar = scanner.nextDouble();

        // Iniciando com folga
        double areaComFolga = (areaPintar * 1.1);
        double quantidadeLitrosTinta = Math.ceil(areaComFolga / 6);

        // Definindo quantidade de latas e valor total
        double quantidadeLatas = Math.ceil(quantidadeLitrosTinta / 18);
        double valorLatas = (quantidadeLatas * 80);

        // Definindo quantidade de galoes e valor total
        double quantidadeGaloes = Math.ceil(quantidadeLitrosTinta / 3.6);
        double valorGaloes = (quantidadeGaloes * 25);

        // Obtendo o menor custo
        double quantidadeMinimaNecessariaLatas = Math.floor(quantidadeLitrosTinta / 18);
        double quantidadeTintaNaoViavelParaLata = quantidadeLitrosTinta - (quantidadeMinimaNecessariaLatas * 18);
        double quantidadeMinimaNecessariaGaloes = Math.ceil(quantidadeTintaNaoViavelParaLata / 3.6);
        double valorCustoBeneficio = ((quantidadeMinimaNecessariaLatas * 80) + (quantidadeMinimaNecessariaGaloes * 25));


        System.out.printf("Para uma área de %.2fm² mais 10%% de folga, serão necessários %.0f litros de tinta.%n",
                areaPintar, quantidadeLitrosTinta);

        System.out.printf("Opção 1: Comprar apenas latas de 18 litros:%n");
        System.out.printf("  - Quantidade de latas: %.0f%n", quantidadeLatas);
        System.out.printf("  - Preço total: R$ %.2f%n%n", valorLatas);

        System.out.printf("Opção 2: Comprar apenas galões de 3,6 litros:%n");
        System.out.printf("  - Quantidade de galões: %.0f%n", quantidadeGaloes);
        System.out.printf("  - Preço total: R$ %.2f%n%n", valorGaloes);

        System.out.printf("Opção 3: Obtendo um melhor custo beneficio: %n");
        System.out.printf("  - Quantidade de latas: %.0f%n", quantidadeMinimaNecessariaLatas);
        System.out.printf("  - Quantidade de galões: %.0f%n", quantidadeMinimaNecessariaGaloes);
        System.out.printf("  - Preço total: R$ %.2f%n", valorCustoBeneficio);
        
    }
}
