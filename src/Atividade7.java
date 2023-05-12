// Nome: Igor Loureiro
// RA: 1292316043
// Programa: Atividade7 Lista04 java
// Data: 11/05/2023

import java.util.Scanner;

public class Atividade7 {
    public static void main (String[] args) throws Exception{
        
        Double diaria, preco1, preco2, preco3;

        System.out.println("Quantos dias você pretende ficar no hotel?");
        Scanner teclado = new Scanner (System.in);
        diaria = teclado.nextDouble();
        teclado.close();

        if (diaria > 15){

            preco1 = diaria * 60;
            preco2 = diaria * 5.50;
            preco3 = preco1 + preco2;

            System.out.println("o Preço da sua estadia total será de R$" + preco3 + ", sendo R$" + preco1 + " o preço da diaria e R$" + preco2 + " a taxa de serviço");

        }

        else{

            if (diaria == 15){

            preco1 = diaria * 60;
            preco2 = diaria * 6;
            preco3 = preco1 + preco2;

            System.out.println("o Preço da sua estadia total será de R$" + preco3 + ", sendo R$" + preco1 + " o preço da diaria e R$" + preco2 + " a taxa de serviço");
            }

            else{

                if (diaria < 15){

                preco1 = diaria * 60;
                preco2 = diaria * 8;
                preco3 = preco1 + preco2;

                System.out.println("o Preço da sua estadia total será de R$" + preco3 + ", sendo R$" + preco1 + " o preço da diaria e R$" + preco2 + " a taxa de serviço");

                }

            }
        }

    }
}

