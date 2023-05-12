// Nome: Igor Loureiro
// RA: 1292316043
// Programa: Atividade16 Lista04 java
// Data: 11/05/2023
import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) throws Exception{
        
        System.out.println("Digite um numero menor que zero");
        Scanner teclado = new Scanner (System.in);
        int numero = teclado.nextInt();
    
        while (numero >= 0){

            System.out.println("O numero informado é maior que zero, por favor digite um numero menor que zero");
            numero = teclado.nextInt();

        }
        teclado.close();
        System.out.println("Parabéns, você digitou um numero menor que zero");

    }
}
