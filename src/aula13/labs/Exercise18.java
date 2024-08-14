/**
 * Autor: Skafikis
 * Professora: Loiane Groner
 *
 * Exercicio:
 * Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps),
 * calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
 *
 */

package aula13.labs;

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo que deseja fazer download(MB): ");
        double mb = scanner.nextDouble();

        System.out.println("Informe a velocidade do seu link de internet(Mbps): ");
        double mbps = scanner.nextDouble();

        double velocidadeInternetConvertida = (mbps / 8); //mbps to mb/s
        double tempoDownloadSegundos = (mb / velocidadeInternetConvertida); //calculando tudo em segundo
        double tempoDownloadMinutos = tempoDownloadSegundos / 60; //convertendo para minutos

        System.out.printf("O seu arquivo de %.2f(MB), irá demorar %.3f minutos.", mb, tempoDownloadMinutos);
        scanner.close();
    }
}