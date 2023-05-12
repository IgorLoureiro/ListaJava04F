// Nome: Igor Loureiro
// RA: 1292316043
// Programa: Atividade8 Lista04 java
// Data: 11/05/2023

import java.util.Scanner;

public class Atividade8 {
    public static void main (String[] args) throws Exception{

        int numero;

        System.out.println("Digite um numero para receber o mês correspondente e a estação do mês");
        Scanner teclado = new Scanner (System.in);
        numero = teclado.nextInt();
        teclado.close();

        switch (numero) {

            case 1: System.out.println("Janeiro - Verão");
            break;
            case 2: System.out.println("Fevereiro - Verão");
            break;
            case 3: System.out.println("Março - Verão");
            break;
            case 4: System.out.println("Abril - Verão");
            break;
            case 5: System.out.println("Maio - Outono");
            break;
            case 6: System.out.println("Junho - Outono");
            break;
            case 7: System.out.println("Julho - Inverno");
            break;
            case 8: System.out.println("Agosto - Inverno");
            break;
            case 9: System.out.println("Setembro - Inverno");
            break;
            case 10: System.out.println("Outubro - Primavera");
            break;
            case 11: System.out.println("Novembro - Primavera");
            break;
            case 12: System.out.println("Dezembro - Primavera");
            break;
            default: System.out.println("Numero invalido, por favor digite um número entre 1 e 12");
            break;

        }

    }
    
}

