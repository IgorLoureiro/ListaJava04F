// Nome: Igor Loureiro
// RA: 1292316043
// Programa: Atividade15 Lista04 java
// Data: 11/05/2023

public class Atividade15 {
    public static void main(String[] args) {
        
        int vetor[][] = new int [11][11];

        int i = 0;
        int i2 = 0;

        while (i <= 10){

            vetor[i][10] = 0;

            i++;

        }

        while(i2 <= 10){

            vetor[10][i2] = 0;

            i2++;

        }

        System.out.printf("%d, %d, %d, %d", vetor[10][1], vetor[10][4], vetor[1][5], vetor[9][5]);

    } 
}
