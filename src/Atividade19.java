// Nome: Igor Loureiro
// RA: 1292316043
// Programa: Atividade19 Lista04 java
// Data: 11/05/2023
import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        
        System.out.println("Informe os centimetros cubicos de um gás para saber em quanto tempo ele chegara a 1000 centimetros cubicos");
        Scanner teclado = new Scanner (System.in);
        double centimetros = teclado.nextDouble();
        teclado.close();
        int time = 0;

        while(centimetros <= 1000){

            centimetros = centimetros * 2;
            time = time + 1;

        }

        System.out.printf("Ira demorar %d segundos para que o gás atinja 1000 centimetros cubicos", time);

    }
}
