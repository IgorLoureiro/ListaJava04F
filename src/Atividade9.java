// Nome: Igor Loureiro
// RA: 1292316043
// Programa: Atividade9 Lista04 java
// Data: 11/05/2023

import java.util.Scanner;

public class Atividade9 {
    public static void main (String [] args) throws Exception{

        Double venda;
        Double valor;
        int numero;

        System.out.println("Informe o valor da venda");
        Scanner teclado = new Scanner (System.in);
        venda = teclado.nextDouble();

        System.out.println("Informe a modalidade da venda entre as seguintes opções:\n1-Venda a Vista\n2-Venda a Prazo 30 dias\n3-Venda a Prazo 60 dias\n4-Venda a  Prazo 90 dias " +
        "\n5-Venda com cartão de débito \n6-Venda com cartão de crédito");
        Scanner teclado2 = new Scanner (System.in);
        numero = teclado2.nextInt();
        teclado.close();
        teclado2.close();

        switch (numero) {

            case 1: valor = venda - (venda * 0.1);
            System.out.println("O valor final a ser pago é de R$" + valor);
            break;

            case 2: valor = venda - (venda * 0.05);
            System.out.println("O valor final a ser pago é de R$" + valor);
            break;

            case 3: 
            System.out.println("O valor final a ser pago é de R$" + venda);
            break;

            case 4: valor = venda + (venda * 0.05);
            System.out.println("O valor final a ser pago é de R$" + valor);
            break;

            case 5: valor = venda - (venda * 0.08);
            System.out.println("O valor final a ser pago é de R$" + valor);
            break;

            case 6: valor = venda - (venda * 0.07);
            System.out.println("O valor final a ser pago é de R$" + valor);
            break;

            default: System.out.println("Por favor, digite um numero de 1 a 6 de acordo com a opção desejada");
            break;
        }
    } 
}