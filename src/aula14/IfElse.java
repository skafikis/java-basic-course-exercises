package aula14;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if(idade >= 18) {
            System.out.println("É maior de idade.");
        } else {
            System.out.println("Não é maior de idade.");
        }


        System.out.println("Digite o preço do item: ");
        double preco = scanner.nextDouble();

        if(preco <= 10) {
            System.out.println("Barato");
        } else if (preco >= 15 && preco < 17) {
            System.out.println("Pesquisar mais");
        } else {
            System.out.println("Muito caro");
        }
    }
}
