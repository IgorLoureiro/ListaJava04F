// Nome: Igor Loureiro
// RA: 1292316043
// Programa: Atividade19 Lista04 java
// Data: 11/05/2023
import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        Integer quantidade, carga, peso, carinf, cardis, quantdis;

        System.out.println("Informe a carga máxima suportada pelo elevador");
        Scanner teclado = new Scanner (System.in);
        carga = teclado.nextInt();
        System.out.println("Informe a quantidade máxima de pessoas suportadas pelo elevador");
        quantidade = teclado.nextInt();
        

        Integer i = 0;
        carinf = 0;
        cardis = 0;
        quantdis = 0;

        do {

            
            System.out.println("Qual o peso do próximo passageiro?");
            peso = teclado.nextInt();
            i++;

            carinf = carinf + peso;

            cardis = carga - carinf;

            quantdis = quantidade - i;

            System.out.printf("O elevador ainda suporta %d kg e %d pessoas \n", cardis, quantdis);
            
        } while(carinf < carga && i < quantidade);

        teclado.close();

        if (i == quantidade){

            System.out.println("A quantidade máxima de pessoas foi atingida");

        } else {

            System.out.println("A carga máxima foi atingida");

        }
    }
}
