// Nome: Igor Loureiro
// RA: 1292316043
// Programa: Atividade2 Lista04 java
// Data: 11/05/2023
import java.util.Arrays;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        
        System.out.println("Informe um numero");

        

        Scanner teclado = new Scanner (System.in);
        int num1 = teclado.nextInt();
        System.out.println("Informe outro numero");
        int num2 = teclado.nextInt();
        System.out.println("Informe outro numero");
        int num3 = teclado.nextInt();
        teclado.close();

        int[] a = {num1, num2, num3};
        Arrays.sort(a);

        System.out.println(Arrays.toString(a));

    } 
}
