package aula13;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int result1 = 1;
        int result2 = 2;

        boolean retorno1 = (result1 == 1) && (result2 == 2);
        System.out.println("result1 é 1 AND result2 é 2 - result: " + retorno1);

        boolean retorno2 = (result1 == 1) || (result2 == 2);
        System.out.println("result1 é 1 OR result2 é 2 - result: " + retorno2);

        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro ^ falso);
        System.out.println(!verdadeiro && falso);
    }
}
