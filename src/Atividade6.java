// Nome: Igor Loureiro
// RA: 1292316043
// Programa: Atividade6 Lista04 java
// Data: 11/05/2023

import java.util.Scanner;

public class Atividade6 {
    public static void main (String[] args) throws Exception{

        Double nota;
        
        System.out.println("Informe a sua nota");
        Scanner teclado = new Scanner (System.in);
        nota = teclado.nextDouble();
        teclado.close();

        if (nota <= 100 && nota >= 85){

            System.out.println("Ótimo");

        }

        else{

            if (nota <= 84 && nota >= 65){

                System.out.println("Bom");

            }

            else{

                if (nota <= 64 && nota >= 50){

                    System.out.println("Regular");
    
                }

                else{

                    if (nota <= 40 && nota >= 0){

                        System.out.println("Insuficiente");
        
                    }

                }

            }

        }

    }
}
