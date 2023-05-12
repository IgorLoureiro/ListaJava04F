// Nome: Igor Loureiro
// RA: 1292316043
// Programa: Atividade1 Lista04 java
// Data: 11/05/2023
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Informe um numero");
        Scanner teclado = new Scanner (System.in);
        int num1 = teclado.nextInt();
        System.out.println("Informe outro numero");
        int num2 = teclado.nextInt();
        teclado.close();

        if (num1 > num2){

            System.out.println(num1);

        } else {

            System.out.println(num2);

        }
    }
}
