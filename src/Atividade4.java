// Nome: Igor Loureiro
// RA: 1292316043
// Programa: Atividade4 Lista04 java
// Data: 11/05/2023

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Informe um numero");
        Scanner teclado = new Scanner (System.in);
        int num1 = teclado.nextInt();
        teclado.close();

        if (num1 % 2 == 0){

            System.out.println("Numero par");

        } else {

            System.out.println("Numero impar");

        }

        if (num1 >= 0){

            System.out.println("Positivo");

        } else {

            System.out.println("Negativo");

        }

    }
}
