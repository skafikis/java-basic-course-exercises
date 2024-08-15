package aula17;

public class LoopFor {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            System.out.println("Valor de i: " + i );
        }
        System.out.println("\n");



        for(int i = 5; i > 0; i--){
            System.out.println("Valor de i: " + i);
        }
        System.out.println("\n");



        for (int i =0, j = 10 ; i < j ; i++, j--){
            System.out.println("i = "+ i + " j = " + j);
        }
        System.out.println("\n");



        int count = 0;
        for ( ; count < 10 ; ){
            System.out.println("valor de count = " + count);
            count += 2;
        }
        System.out.println("\n");



        for (int cont = 0; cont < 10; cont +=2 ){
            System.out.println("valor de cont = " + cont);
        }
        System.out.println("\n");



        int soma = 0;
        for (int i = 1; i < 5; soma += i++);
        System.out.println("soma = " + soma);
        System.out.println("\n");



        for(int i = 0; i < 5; i++){
            System.out.println("Valor de i: " + i );
        }
        System.out.println("\n");



        // for(;;){System.out.println("666");}
    }
}
