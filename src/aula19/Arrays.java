package aula19;

public class Arrays {
    public static void main(String[] args) {
        double tempDia001 = 31.3;
        double tempDia002 = 32;
        double tempDia003 = 33.7;
        double tempDia004 = 34;
        double tempDia005 = 32;

        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 30.3;
        temperaturas[2] = 29.3;
        temperaturas[3] = 35.3;
        temperaturas[4] = 34;
        temperaturas[5] = 32;

        System.out.println("O valor da temperatura do dia 1 é: " + temperaturas[0]);
        System.out.println("O tamanho do array: " + temperaturas.length);
        System.out.println("Endereco de memoria: " + temperaturas);
        System.out.println("Valores do array:");

        for (int i=0; i<temperaturas.length; i++){
            System.out.println("O valor da temperatura do dia " + (i+1) + " é " + temperaturas[i]);
        }


        for (double temp : temperaturas){
            System.out.println(temp);
        }

    }
}
