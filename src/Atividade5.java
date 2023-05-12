// Nome: Igor Loureiro
// RA: 1292316043
// Programa: Atividade5 Lista04 java
// Data: 11/05/2023

import java.util.Scanner;

public class Atividade5 {
    public static void main (String [] args) throws Exception{

        String Nome, Sobrenome, Naturalidade, escolha;
        Double idade;

        System.out.println("Digite seu Nome, Sobrenome e naturalidade");
        Scanner teclado = new Scanner (System.in);
        Nome = teclado.next();
        Sobrenome = teclado.next();
        Naturalidade = teclado.next();
        

        System.out.println("Qual sua idade?");
        Scanner Key = new Scanner (System.in);
        idade = Key.nextDouble();
        

        System.out.println("Deseja visualizar dados completos? (Digite S para Sim ou N para Não)");
        Scanner Board = new Scanner (System.in);
        escolha = Board.next();
        teclado.close();
        Key.close();
        Board.close();

        switch (escolha) {

            case "S":
                System.out.println("Nome completo: " + Nome + " " + Sobrenome + " Naturalidade: " + Naturalidade + " Idade: " + idade);
                break;
            case "N":
                System.out.println("Nome: " + Nome + " " + "Idade: " + idade);
                break;
            default:
                System.out.println("Comando inválido, por favor digitar S para Sim ou N para Não");
                break;


        }

    }
    
}