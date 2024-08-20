package aula14.labs;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano, e veja mesmo é bissexto:");
        int ano = sc.nextInt();

        if(ano % 4 == 0 && ano % 100 !=0){
            System.out.println("O ano é bissexto (tem 366 dias).");
        } else {
            System.out.println("O ano não é um ano bissexto (tem 365 dias).");
        }
    }
}