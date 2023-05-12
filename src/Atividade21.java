// Nome: Igor Loureiro
// RA: 1292316043
// Programa: Atividade19 Lista04 java
// Data: 11/05/2023
// Escreva um programa que, dado um número positivo digitado pelo o usuário mostre a tabuada de todos os números de 1 até o
// número digitado. (utilize for)
import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) throws Exception{

    int i;
    int i2 = 1;
    int i3 = 0;
    
    System.out.println("Digite um numero");
    Scanner teclado = new Scanner (System.in);
    int numero = teclado.nextInt();
    teclado.close();

    for(i = 0; i2 <= numero; i++){

        i3 = i * i2;

        System.out.printf("%d x %d = %d", i, i2, i3);
        System.out.println("");

        if(i3 + i2 > numero || i == numero){

            i3 = 0;
            i = 0;
            i2++;

        }

        if (i2 == 11){

            break;

        }

    } 

    }
}
