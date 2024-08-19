package aula20;

public class Matrizes {
    public static void main(String[] args) {

        double [] [] notasAlunos = new double[5][4];

        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 8;
        notasAlunos[0][2] = 9.2;
        notasAlunos[0][3] = 10;

        notasAlunos[1][0] = 6;
        notasAlunos[1][1] = 7;
        notasAlunos[1][2] = 6;
        notasAlunos[1][3] = 8;

        notasAlunos[2][0] = 1;
        notasAlunos[2][1] = 7;
        notasAlunos[2][2] = 4;
        notasAlunos[2][3] = 2;

        notasAlunos[3][0] = 3;
        notasAlunos[3][1] = 7;
        notasAlunos[3][2] = 6.9;
        notasAlunos[3][3] = 8;

        for(int i=0; i<notasAlunos.length; i++){
            // System.out.println(notasAlunos[i]);
            for (int j=0; j< notasAlunos[i].length;j++){
                System.out.println(notasAlunos[i][j]+" - ");
            }
            System.out.println();
        }

        notasAlunos[1][3]=8;
        System.out.println();
        for(int i=0; i<notasAlunos.length; i++) {
            // System.out.println(notasAlunos[i]);
            for (int j = 0; j < notasAlunos[i].length; j++) {
                System.out.println(notasAlunos[i][j] + " - ");
            }
            System.out.println();
        }

        System.out.println("Calculando a média de cada aluno");

        double soma;
        for(int i = 0; i < notasAlunos.length; i++){

            soma = 0;
            for (int j=0; j<notasAlunos[i].length; j++){
                soma += notasAlunos[i][j];
            }
            System.out.println("Média do aluno " + i + " é = " + (soma/4));
        }

        double[] notasAlunos1 = {7,8, 9, 5};

        double[][] notasAlunos2 = {{7, 8, 9, 10, }, {8,6,7,10}};

        System.out.println("Output da matriz notasAlunos2");

        for(int i=0; i<notasAlunos2.length; i++){
            // System.out.println(notasAlunos[i]);
            for (int j=0; j< notasAlunos2[i].length;j++){
                System.out.print(notasAlunos[i][j]+" - ");
            }
            System.out.println();
        }

    }
}
