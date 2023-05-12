// Nome: Igor Loureiro
// RA: 1292316043
// Programa: Atividade3 Lista04 java
// Data: 11/05/2023

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) throws Exception{
        
        System.out.println("Informe um numero");
        Scanner teclado = new Scanner (System.in);
        int num1 = teclado.nextInt();
        System.out.println("Informe outro numero");
        int num2 = teclado.nextInt();
        teclado.close();

        if (num1 % num2 == 0 || num2 % num1 == 0){

            System.out.println("são multiplos");

        } else {

            System.out.println("Não são multiplos");

        }

    }
}
