package aula18;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int num1 = scanner.nextInt();

        System.out.println("Digite um limite");
        int max = scanner.nextInt();


        for(int i = num1; i <= max; i++){
            if(i % 7 == 0){
                continue;
            }
            System.out.println("valor de i = " + i);
        }
        System.out.println();


    }
}
